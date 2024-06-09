package com.yupi.usercenter_java.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 通用返回类
 *
 * @author 陈君哲
 */
@Data
public class BaseResponse<T> implements Serializable {


    @Serial
    private static final long serialVersionUID = 4676806025325695997L;

    private int code;

    private T data;

    private String msg;

    private String description;

    public BaseResponse(int code, T data, String msg, String description) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.description = description;
    }

    public BaseResponse(int code, T data, String msg) {
        this(code, data, msg, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data,"", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMsg(), errorCode.getDescription());
    }
}
