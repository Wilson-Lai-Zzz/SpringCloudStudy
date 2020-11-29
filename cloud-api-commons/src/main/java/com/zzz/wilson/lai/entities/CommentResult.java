package com.zzz.wilson.lai.entities;

import java.io.Serializable;

/**
 * 传递给前端的固定bean
 * */
public class CommentResult<T> implements Serializable {
    /**
     * 状态
     * */
    private Integer code;
    /**
     * 消息
     * */
    private String message;
    /**
     * 内容
     * */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommentResult(Integer code, String message) {
        this(code,message,null);
    }

    public CommentResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommentResult() {
    }
}
