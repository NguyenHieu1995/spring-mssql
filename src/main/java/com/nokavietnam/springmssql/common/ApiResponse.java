package com.nokavietnam.springmssql.common;

import java.io.Serializable;

/**
 * @author : NOKA NGUYEN
 * @since : 6/3/2021, Thu
 **/
public class ApiResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private int errorCode;
    private String message;
    private Object data;

    public ApiResponse(int errorCode, String message, Object data) {
        super();
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
