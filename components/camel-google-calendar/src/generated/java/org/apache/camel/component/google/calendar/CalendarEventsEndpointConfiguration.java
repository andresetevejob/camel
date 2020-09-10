
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.calendar.Calendar$Events
 */
@ApiParams(apiName = "events", apiMethods = "calendarImport,delete,get,insert,instances,list,move,patch,quickAdd,update,watch")
@UriParams
@Configurer
public final class CalendarEventsEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam(description = "Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword.")
    private String calendarId;
    @UriParam(description = "The com.google.api.services.calendar.model.Event")
    private com.google.api.services.calendar.model.Event content;
    @UriParam(description = "The com.google.api.services.calendar.model.Channel")
    private com.google.api.services.calendar.model.Channel contentChannel;
    @UriParam(description = "Calendar identifier of the target calendar where the event is to be moved to")
    private String destination;
    @UriParam(description = "Event identifier")
    private String eventId;
    @UriParam(description = "The text describing the event to be created")
    private String text;

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public com.google.api.services.calendar.model.Event getContent() {
        return content;
    }

    public void setContent(com.google.api.services.calendar.model.Event content) {
        this.content = content;
    }

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}