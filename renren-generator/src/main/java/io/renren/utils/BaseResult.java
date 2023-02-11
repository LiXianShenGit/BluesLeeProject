/**
 * DongJun.com Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package io.renren.utils;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 返回基础类
 * @author jinyiding
 * @version $Id: BaseResult.java, v 0.1 2015年7月19日 上午11:09:23 jinyiding Exp $
 */
public abstract class BaseResult implements Serializable {

    /**  */
    private static final long      serialVersionUID = 5124385865739590211L;

    /** 成功 */
    protected final static boolean SUCCESS          = true;

    /** 失败 */
    protected final static boolean FAILURE          = false;

    /**
     * 操作执行结果
     */
    private boolean                isSuccess;

    /**
     * 错误描述码
     */
    private String                 errorCode;

    /**
     * message
     */
    private String                 message;

    /**
     * 返回的自定义数据
     */
    private Object                 data;

    /**
     *
     */
    public BaseResult() {
    }

    /**
     * 构造
     * @param isSuccess  是否成功
     */
    public BaseResult(final boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * 构造
     * @param isSuccess  是否成功
     * @param data 自定义返回对象
     */
    public BaseResult(final boolean isSuccess, final Object data) {
        this.isSuccess = isSuccess;
        this.data = data;
    }

    /**
     * 构造
     * @param isSuccess 是否成功
     * @param message 返回的消息
     */
    public BaseResult(final boolean isSuccess, final String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }

    /**
     * 构造
     * @param isSuccess 是否成功
     * @param message 返回的消息
     * @param data 自定义返回对象
     */
    public BaseResult(final boolean isSuccess, final String message, final Object data) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.data = data;
    }

    /**
     * 构造（失败构造）
     *
     * @param errorCode
     * @param message
     * @param data
     */
    public BaseResult(final String errorCode, final String message, final Object data) {
        this.isSuccess = false;
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    /**
     * 获取是否成功
     * @return 成功true
     */
    public boolean isSuccess() {
        return this.isSuccess;
    }

    /**
     * setSuccess
     * @param isSuccess
     */
    @JsonSetter("success")
    public void setIsSuccess(final boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * 获取错误码
     * @return 错误码
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * setErrorCode
     * @param errorCode
     */
    public void setErrorCode(final String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property <tt>data</tt>.
     *
     * @return property value of data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     *
     * @param data value to be assigned to property data
     */
    public void setData(final Object data) {
        this.data = data;
    }

    /**
     * Getter method for property <tt>message</tt>.
     *
     * @return property value of message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     *
     * @param message value to be assigned to property message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

}
