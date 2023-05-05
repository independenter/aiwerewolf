package com.aiwolf.reponse;

import lombok.Getter;

@Getter
public final class PageR<T> extends R {

    private long total;

    public PageR(Integer code, String message, Object data, long total) {
        super(code, message, data);
        this.total = total;
    }
}
