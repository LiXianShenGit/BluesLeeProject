/**
 * DongJun.com Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package io.renren.utils;

/**
 * 上传结果返回封装,可自己扩展
 * @author jinyiding
 * @version $Id: UploadResult.java, v 0.1 2015年7月19日 上午11:08:01 jinyiding Exp $
 */
public class UploadResult extends BaseResult {

    /**  */
    private static final long   serialVersionUID   = 3158489045341343030L;

    /** 上传成功默认提示 */
    private static final String UPLOAD_SUCCESS_MSG = "上传成功!";

    /** 上传失败默认提示 */
    private static final String UPLOAD_ERROR_MSG   = "上传失败!";

    /**
     * @param isSuccess
     * @param message
     * @param data
     */
    public UploadResult(final boolean isSuccess, final String message, final Object data) {
        super(isSuccess, message, data);
    }

    /**
     * @param isSuccess
     * @param message
     */
    public UploadResult(final boolean isSuccess, final String message) {
        super(isSuccess, message);
    }

    /**
     * @param isSuccess
     */
    public UploadResult(final boolean isSuccess) {
        super(isSuccess);
    }

    /**
     * 默认成功返回
     * @return UploadResult
     */
    public static UploadResult success() {
        return new UploadResult(BaseResult.SUCCESS, UploadResult.UPLOAD_SUCCESS_MSG);
    }

    /**
     * 默认成功并带成功信息以及上传后的相对路径
     * @param message
     * @param relativePath 上传后的相对路径,基于static配置下
     * @return UploadResult
     */
    public static UploadResult success(final String message, final String relativePath) {
        return new UploadResult(BaseResult.SUCCESS, message, relativePath);
    }

    /**
     * 默认成功并带上传后的相对路径
     * @param relativePath 上传后的相对路径,基于static配置下
     * @return UploadResult
     */
    public static UploadResult success(final String relativePath) {
        return UploadResult.success(UploadResult.UPLOAD_SUCCESS_MSG, relativePath);
    }

    /**
     *
     * @param data
     * @return UploadResult
     */
    public static UploadResult success(final Object data) {
        return new UploadResult(BaseResult.SUCCESS, UploadResult.UPLOAD_SUCCESS_MSG, data);
    }

    /**
     * 默认成功并带成功信息以及数据
     * @param message
     * @param data
     * @return UploadResult
     */
    public static UploadResult success(final String message, final Object data) {
        return new UploadResult(BaseResult.SUCCESS, message, data);
    }

    /**
     * 默认错误返回
     * @return UploadResult
     */
    public static UploadResult error() {
        return new UploadResult(BaseResult.FAILURE, UploadResult.UPLOAD_ERROR_MSG);
    }

    /**
     * 默认错误并带message
     * @param message
     * @return UploadResult
     */
    public static UploadResult error(final String message) {
        return new UploadResult(BaseResult.FAILURE, message);
    }

    /**
     * 默认错误并带message,data
     * @param message
     * @param data
     * @return UploadResult
     */
    public static UploadResult error(final String message, final Object data) {
        return new UploadResult(BaseResult.FAILURE, message, data);
    }

}
