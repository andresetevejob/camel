/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dsl.yaml.deserializers;

import java.util.Map;

import org.apache.camel.dsl.yaml.common.YamlDeserializationContext;
import org.apache.camel.dsl.yaml.common.YamlDeserializerResolver;
import org.apache.camel.dsl.yaml.common.YamlSupport;
import org.apache.camel.model.ToDefinition;
import org.apache.camel.spi.annotations.YamlProperty;
import org.apache.camel.spi.annotations.YamlType;
import org.apache.camel.util.ObjectHelper;
import org.snakeyaml.engine.v2.api.ConstructNode;
import org.snakeyaml.engine.v2.nodes.MappingNode;
import org.snakeyaml.engine.v2.nodes.Node;
import org.snakeyaml.engine.v2.nodes.NodeTuple;
import org.snakeyaml.engine.v2.nodes.NodeType;

import static org.apache.camel.dsl.yaml.common.YamlDeserializerSupport.asScalarMap;
import static org.apache.camel.dsl.yaml.common.YamlDeserializerSupport.asText;
import static org.apache.camel.dsl.yaml.common.YamlDeserializerSupport.getDeserializationContext;
import static org.apache.camel.dsl.yaml.common.YamlDeserializerSupport.setDeserializationContext;

@YamlType(
          inline = true,
          types = ToDefinition.class,
          order = YamlDeserializerResolver.ORDER_DEFAULT,
          properties = {
                  @YamlProperty(name = "uri", type = "string", required = true),
                  @YamlProperty(name = "properties", type = "object")
          })
public class ToDefinitionDeserializer implements ConstructNode {
    @Override
    public Object construct(Node node) {
        return constructFromDefinition(node);
    }

    public static ToDefinition constructFromDefinition(Node node) {
        if (node.getNodeType() == NodeType.SCALAR) {
            return new ToDefinition(asText(node));
        } else if (node.getNodeType() == NodeType.MAPPING) {
            final MappingNode mn = (MappingNode) node;
            final YamlDeserializationContext dc = getDeserializationContext(node);

            String uri = null;
            Map<String, Object> properties = null;

            for (NodeTuple tuple : mn.getValue()) {
                final String key = asText(tuple.getKeyNode());
                final Node val = tuple.getValueNode();

                setDeserializationContext(val, dc);

                switch (key) {
                    case "uri":
                        uri = asText(val);
                        break;
                    case "properties":
                        properties = asScalarMap(tuple.getValueNode());
                        break;
                    default:
                        ConstructNode cn = EndpointProducerDeserializersResolver.resolveEndpointConstructor(key);
                        if (cn != null) {
                            if (uri != null || properties != null) {
                                throw new IllegalArgumentException(
                                        "uri and properties are not supported when using Endpoint DSL ");
                            }
                            return (ToDefinition) cn.construct(val);
                        } else {
                            throw new IllegalArgumentException("Unsupported field: " + key);
                        }
                }

                ObjectHelper.notNull("uri", "The uri must set");
            }

            return new ToDefinition(
                    YamlSupport.createEndpointUri(dc.getCamelContext(), uri, properties));
        }

        return null;
    }
}
