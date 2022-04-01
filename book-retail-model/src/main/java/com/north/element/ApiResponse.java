package com.north.element;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
@Data
public final class ApiResponse<T> implements Serializable {

    private T data;

    private String message;

    private Integer code;

    public ApiResponse() {
        this((T) null);
    }

    public ApiResponse(T data) {
        this(0, "", data);
    }

    protected ApiResponse(int code, String message) {
        this(code, message, (T) null);
    }

    public ApiResponse(int code, String message, T data) {
        if (code < 0) {
            throw new IllegalArgumentException("CODE");
        } else if (message == null) {
            throw new IllegalArgumentException("MESSAGE");
        } else {
            this.code = code;
            this.message = message;
            this.data = data;
        }
    }

    public static <T> ApiResponse<T> success() {
        return new ApiResponse((Object)null);
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse(data);
    }

    public static <T> ApiResponse<T> fail(int code, String message) {
        if (code <= 0) {
            throw new IllegalArgumentException("CODE");
        } else if (message == null) {
            throw new IllegalArgumentException("MESSAGE");
        } else {
            return new ApiResponse(code, message);
        }
    }

}
