package com.modeush.amazon.util;

public class CHException extends Exception{
    // 错误码
    private Integer errCode;
    // 显示的错误信息
    private String errMsg;
    // 堆栈内的详细错误信息
    private String traceMsg = "";

    public CHException() {
        super();
    }

    public CHException(String message, Throwable cause) {
        super(message, cause);
    }

    public CHException(String message) {
        super(message);
    }

    public CHException(Throwable cause) {
        super(cause);
    }

    public CHException(Integer errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public CHException(Integer errCode, String errMsg, String traceMsg) {
        super(errCode + ":" + errMsg + ":" + traceMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.traceMsg = traceMsg;
    }

    public Integer getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String getTraceMsg() {
        return this.traceMsg;
    }

    public String getErrorStr() {
        return this.errCode+" "+this.errMsg;
    }
}
