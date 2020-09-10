
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.call.Recording;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.call.Recording
 */
public enum CallRecordingApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.call.RecordingCreator.class,
        "creator",
        arg("pathCallSid", String.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.call.RecordingCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("pathCallSid", String.class)),

    DELETER(
        com.twilio.rest.api.v2010.account.call.RecordingDeleter.class,
        "deleter",
        arg("pathCallSid", String.class),
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.call.RecordingDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathCallSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.call.RecordingFetcher.class,
        "fetcher",
        arg("pathCallSid", String.class),
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.call.RecordingFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathCallSid", String.class),
        arg("pathSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.call.RecordingReader.class,
        "reader",
        arg("pathCallSid", String.class)),

    READER_1(
        com.twilio.rest.api.v2010.account.call.RecordingReader.class,
        "reader",
        arg("pathAccountSid", String.class),
        arg("pathCallSid", String.class)),

    UPDATER(
        com.twilio.rest.api.v2010.account.call.RecordingUpdater.class,
        "updater",
        arg("pathCallSid", String.class),
        arg("pathSid", String.class),
        arg("status", com.twilio.rest.api.v2010.account.call.Recording.Status.class)),

    UPDATER_1(
        com.twilio.rest.api.v2010.account.call.RecordingUpdater.class,
        "updater",
        arg("pathAccountSid", String.class),
        arg("pathCallSid", String.class),
        arg("pathSid", String.class),
        arg("status", com.twilio.rest.api.v2010.account.call.Recording.Status.class));

    private final ApiMethod apiMethod;

    private CallRecordingApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Recording.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}