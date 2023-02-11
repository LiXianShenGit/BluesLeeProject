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
public abstract class BaseWebResult<T> implements Serializable {

    /**  */
    private static final long      serialVersionUID = 5124385865739590211L;

    /** 成功 */
    protected final static boolean SUCCESS          = true;

    /** 失败 */
    protected final static boolean FAILURE          = false;

    /**
     * 操作执行结果
     */
    private boolean                success;

    /**
     * 错误描述码
     */
    private int                    errorCode;

    /**
     * message
     */
    private String                 message;

    private Integer                status;

    /**
     * 返回的自定义数据
     */
    private T                      data;

    /**
     *
     */
    public BaseWebResult() {
    }

    /**
     * 构造
     * @param success  是否成功
     */
    public BaseWebResult(final boolean success) {
        this.success = success;
    }

    /**
     * 构造
     * @param success  是否成功
     * @param data 自定义返回对象
     */
    public BaseWebResult(final boolean success, final T data) {
        this.success = success;
        this.data = data;
    }

    /**
     * 构造
     * @param success 是否成功
     * @param message 返回的消息
     */
    public BaseWebResult(final boolean success, final String message) {
        this.success = success;
        this.message = message;
    }

    /**
     * 构造
     * @param success 是否成功
     * @param message 返回的消息
     * @param data 自定义返回对象
     */
    public BaseWebResult(final boolean success, final String message, final T data) {
        this.success = success;
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
    public BaseWebResult(final int errorCode, final String message, final T data) {
        this.success = false;
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    /**
     * 失败返回构造，不带返回数据
     * @author zhangguoping
     * @date 2019/8/16 10:10
     * @param success
     * @param errorCode
     * @param message * @exception
     * @return  {@link }
     */
    public BaseWebResult(final boolean success, final int errorCode, final String message) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
    }

    /**
     * 失败返回构造，不带返回数据
     * @author zhangguoping
     * @date 2019/8/16 10:10
     * @param success
     * @param errorCode
     * @param message * @exception
     * @return  {@link }
     */
    public BaseWebResult(final boolean success, final int errorCode, final String message,
                         final T data) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    /**
     * setSuccess
     * @param success
     */
    @JsonSetter("success")
    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return this.success;
    }

    /**
     * 获取错误码
     * @return 错误码
     */
    public int getErrorCode() {
        return this.errorCode;
    }

    /**
     * setErrorCode
     * @param errorCode
     */
    public void setErrorCode(final int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property <tt>data</tt>.
     *
     * @return property value of data
     */
    public T getData() {
        return this.data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     *
     * @param data value to be assigned to property data
     */
    public void setData(final T data) {
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

    /**
     * 获取 status.
     * @return $field.typeName  {@link int}
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 status.
     *
     * <p>You can use getStatus() to get the value of status</p>
     *
     * @param status status
     */
    public void setStatus(final Integer status) {
        this.status = status;
    }
}
