package com.modeush.amazon.entity;

public class AzActionBrowserEntity {
    private Integer id;

    private String name;

    private String actionUrl;

    private String actionRequestType;

    private String actionParams;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl == null ? null : actionUrl.trim();
    }

    public String getActionRequestType() {
        return actionRequestType;
    }

    public void setActionRequestType(String actionRequestType) {
        this.actionRequestType = actionRequestType == null ? null : actionRequestType.trim();
    }

    public String getActionParams() {
        return actionParams;
    }

    public void setActionParams(String actionParams) {
        this.actionParams = actionParams == null ? null : actionParams.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}