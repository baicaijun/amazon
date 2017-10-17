package com.modeush.amazon.entity;

public class AzUserActionEntity {
    private Integer id;

    private String userId;

    private String actionGroupId;

    private String actionTime;

    private String createTime;

    private String close;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getActionGroupId() {
        return actionGroupId;
    }

    public void setActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId == null ? null : actionGroupId.trim();
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime == null ? null : actionTime.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getClose() {
        return close;
    }

    public void setSwitch(String close) {
        this.close = close == null ? null : close.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}