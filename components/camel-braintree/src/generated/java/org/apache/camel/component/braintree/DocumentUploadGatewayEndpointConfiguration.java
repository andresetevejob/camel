
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.braintreegateway.DocumentUploadGateway
 */
@ApiParams(apiName = "documentUpload", apiMethods = "create")
@UriParams
@Configurer
public final class DocumentUploadGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    private com.braintreegateway.DocumentUploadRequest request;

    public com.braintreegateway.DocumentUploadRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.DocumentUploadRequest request) {
        this.request = request;
    }
}