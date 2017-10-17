package com.modeush.amazon.entity;

public class RequestEntity {

    private String browserName;
    private String groupId;
    private String userActionId;

    public String getBrowserName() {
        return browserName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserActionId() {
        return userActionId;
    }

    public void setUserActionId(String userActionId) {
        this.userActionId = userActionId;
    }

    @Override
    public String toString() {
        return "RequestEntity{" +
                "browserName='" + browserName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", userActionId='" + userActionId + '\'' +
                '}';
    }
}
