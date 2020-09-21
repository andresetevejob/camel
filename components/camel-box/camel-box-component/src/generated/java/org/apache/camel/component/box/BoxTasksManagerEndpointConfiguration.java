
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxTasksManager}.
 */
@ApiParams(apiName = "tasks", producerOnly = true,
           description = "Provides operations to manage Box tasks",
           apiMethods = {@ApiMethod(methodName = "addAssignmentToTask", description="Add assignment for task", signatures={"com.box.sdk.BoxTask addAssignmentToTask(String taskId, com.box.sdk.BoxUser assignTo)"}), @ApiMethod(methodName = "addFileTask", description="Add task to file", signatures={"com.box.sdk.BoxTask addFileTask(String fileId, com.box.sdk.BoxTask$Action action, java.util.Date dueAt, String message)"}), @ApiMethod(methodName = "deleteTask", description="Delete task", signatures={"void deleteTask(String taskId)"}), @ApiMethod(methodName = "deleteTaskAssignment", description="Delete task assignment", signatures={"void deleteTaskAssignment(String taskAssignmentId)"}), @ApiMethod(methodName = "getFileTasks", description="Get a list of any tasks on file", signatures={"java.util.List<com.box.sdk.BoxTask$Info> getFileTasks(String fileId)"}), @ApiMethod(methodName = "getTaskAssignmentInfo", description="Get task assignment information", signatures={"com.box.sdk.BoxTaskAssignment$Info getTaskAssignmentInfo(String taskAssignmentId)"}), @ApiMethod(methodName = "getTaskAssignments", description="Get a list of any assignments for task", signatures={"java.util.List<com.box.sdk.BoxTaskAssignment$Info> getTaskAssignments(String taskId)"}), @ApiMethod(methodName = "getTaskInfo", description="Get task information", signatures={"com.box.sdk.BoxTask$Info getTaskInfo(String taskId)"}), @ApiMethod(methodName = "updateTaskInfo", description="Update task information", signatures={"com.box.sdk.BoxTask updateTaskInfo(String taskId, com.box.sdk.BoxTask$Info info)"})}, aliases = {"addFileTask=add", "deleteTask=delete", "getFileTasks=tasks", "getTaskInfo=info", "updateTaskInfo=updateInfo", "addAssignmentToTask=addAssignment", "deleteTaskAssignment=deleteAssignment", "getTaskAssignments=assignments", "getTaskAssignmentInfo=assignmentInfo"})
@UriParams
@Configurer
public final class BoxTasksManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addFileTask", description="The action the task assignee will be prompted to do")})
    private com.box.sdk.BoxTask.Action action;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addAssignmentToTask", description="The user to assign to task")})
    private com.box.sdk.BoxUser assignTo;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addFileTask", description="The day at which this task is due")})
    private java.util.Date dueAt;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addFileTask", description="The id of file to add task to"), @ApiMethod(methodName = "getFileTasks", description="The id of file")})
    private String fileId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "updateTaskInfo", description="The updated information")})
    private com.box.sdk.BoxTask.Info info;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "addFileTask", description="An optional message to include with the task")})
    private String message;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleteTaskAssignment", description="The id of task assignment to delete"), @ApiMethod(methodName = "getTaskAssignmentInfo", description="The id of task assignment")})
    private String taskAssignmentId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addAssignmentToTask", description="The id of task to add assignment for"), @ApiMethod(methodName = "deleteTask", description="The id of task to delete"), @ApiMethod(methodName = "getTaskAssignments", description="The id of task"), @ApiMethod(methodName = "getTaskInfo", description="The id of task"), @ApiMethod(methodName = "updateTaskInfo", description="The id of task")})
    private String taskId;

    public com.box.sdk.BoxTask.Action getAction() {
        return action;
    }

    public void setAction(com.box.sdk.BoxTask.Action action) {
        this.action = action;
    }

    public com.box.sdk.BoxUser getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(com.box.sdk.BoxUser assignTo) {
        this.assignTo = assignTo;
    }

    public java.util.Date getDueAt() {
        return dueAt;
    }

    public void setDueAt(java.util.Date dueAt) {
        this.dueAt = dueAt;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public com.box.sdk.BoxTask.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxTask.Info info) {
        this.info = info;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTaskAssignmentId() {
        return taskAssignmentId;
    }

    public void setTaskAssignmentId(String taskAssignmentId) {
        this.taskAssignmentId = taskAssignmentId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}