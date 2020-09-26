/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo2;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class Olingo2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(38);
        set.add("apiName");
        set.add("methodName");
        set.add("connectTimeout");
        set.add("contentType");
        set.add("entityProviderReadProperties");
        set.add("entityProviderWriteProperties");
        set.add("filterAlreadySeen");
        set.add("httpHeaders");
        set.add("inBody");
        set.add("proxy");
        set.add("serviceUri");
        set.add("socketTimeout");
        set.add("bridgeErrorHandler");
        set.add("sendEmptyMessageWhenIdle");
        set.add("splitResult");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("pollStrategy");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("httpAsyncClientBuilder");
        set.add("httpClientBuilder");
        set.add("synchronous");
        set.add("backoffErrorThreshold");
        set.add("backoffIdleThreshold");
        set.add("backoffMultiplier");
        set.add("delay");
        set.add("greedy");
        set.add("initialDelay");
        set.add("repeatCount");
        set.add("runLoggingLevel");
        set.add("scheduledExecutorService");
        set.add("scheduler");
        set.add("schedulerProperties");
        set.add("startScheduler");
        set.add("timeUnit");
        set.add("useFixedDelay");
        set.add("sslContextParameters");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "olingo2".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}
