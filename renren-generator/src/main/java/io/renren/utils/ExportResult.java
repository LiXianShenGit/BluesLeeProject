/**
 * DongJun.com Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package io.renren.utils;

/**
 * 导出结果
 *
 * @author LJJ
 * @version $Id: ExportResult.java, v 0.1 2018年5月9日 下午5:54:53 LJJ Exp $
 */
public class ExportResult extends BaseResult {

    /**  */
    private static final long   serialVersionUID   = 3158489045341343030L;

    /** 上传成功默认提示 */
    private static final String EXPORT_SUCCESS_MSG = "导出成功!";

    /** 上传失败默认提示 */
    private static final String EXPORT_ERROR_MSG   = "导出失败!";

    /**
     * @param isSuccess
     * @param message
     * @param data
     */
    public ExportResult(final boolean isSuccess, final String message, final Object data) {
        super(isSuccess, message, data);
    }

    /**
     * @param isSuccess
     * @param message
     */
    public ExportResult(final boolean isSuccess, final String message) {
        super(isSuccess, message);
    }

    /**
     * @param isSuccess
     */
    public ExportResult(final boolean isSuccess) {
        super(isSuccess);
    }

    /**
     * 默认成功返回
     * @return UploadResult
     */
    public static ExportResult success() {
        return new ExportResult(BaseResult.SUCCESS, ExportResult.EXPORT_SUCCESS_MSG);
    }

    /**
     * 默认成功并带成功信息以及上传后的相对路径
     * @param message
     * @param relativePath 上传后的相对路径,基于static配置下
     * @return UploadResult
     */
    public static ExportResult success(final String message, final String relativePath) {
        return new ExportResult(BaseResult.SUCCESS, message, relativePath);
    }

    /**
     * 默认成功并带上传后的相对路径
     * @param relativePath 上传后的相对路径,基于static配置下
     * @return UploadResult
     */
    public static ExportResult success(final String relativePath) {
        return ExportResult.success(ExportResult.EXPORT_SUCCESS_MSG, relativePath);
    }

    /**
     *
     * @param data
     * @return UploadResult
     */
    public static ExportResult success(final Object data) {
        return new ExportResult(BaseResult.SUCCESS, ExportResult.EXPORT_SUCCESS_MSG, data);
    }

    /**
     * 默认错误返回
     * @return UploadResult
     */
    public static ExportResult error() {
        return new ExportResult(BaseResult.FAILURE, ExportResult.EXPORT_ERROR_MSG);
    }

    /**
     * 默认错误并带message
     * @param message
     * @return UploadResult
     */
    public static ExportResult error(final String message) {
        return new ExportResult(BaseResult.FAILURE, message);
    }

    /**
     * 默认错误并带message,data
     * @param message
     * @param data
     * @return UploadResult
     */
    public static ExportResult error(final String message, final Object data) {
        return new ExportResult(BaseResult.FAILURE, message, data);
    }

}
