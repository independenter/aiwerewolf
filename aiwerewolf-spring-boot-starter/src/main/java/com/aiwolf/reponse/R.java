package com.aiwolf.reponse;

import lombok.Getter;

@Getter
public sealed class R<T> permits PageR {
    private Integer code;
    private String message;
    private T data;

    public R(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> R<T> ok(T data) {
        return new R<>(ResultEnum.SUCCESS.code(), ResultEnum.SUCCESS.message(), data);
    }

    public static R<?> err() {
        return new R<>(ResultEnum.COMMON_FAILED.code(), ResultEnum.COMMON_FAILED.message(), null);
    }
}