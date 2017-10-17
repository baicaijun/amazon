package com.modeush.amazon.entity;

import com.google.gson.JsonObject;

public class ResultEntity {
    private Integer errorNum;
    private JsonObject data;
    private String message;
    private Integer pageSize;
    private Integer pageNum;
    private String timeStmap;

    public Integer getErrorNum() {
        return errorNum;
    }

    public JsonObject getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public String getTimeStmap() {
        return timeStmap;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    public void setData(JsonObject data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setTimeStmap(String timeStmap) {
        this.timeStmap = timeStmap;
    }
}
