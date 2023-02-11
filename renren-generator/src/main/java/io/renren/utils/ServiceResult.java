package io.renren.utils;

/**
 * 业务层返回封装,可自己扩展
 *
 * @author jinyiding
 * @version $Id: ServiceResult.java, v 0.1 2015年7月19日 上午11:22:10 jinyiding Exp $
 */
public class ServiceResult extends BaseResult {

    /**  */
    private static final long   serialVersionUID = -4658326395142762209L;

    private static final String MSG_TIMEOUT      = "reponse timeout";

    /**
     * 发送是否超时, 常用于同步发送接口 <br>
     * 如果同步指令的返回超出指定时间则返回的 {@link #isTimeout()} 为true
     */
    protected boolean           isTimeout        = false;

    /**
     * 返回响应结果是否已经超时, 即服务端在指定时间内未收到同步指令的RS响应
     * @return true:响应超时
     */
    public boolean isTimeout() {
        return this.isTimeout;
    }

    /**
     * 设置是否超时
     * @param isTimeout
     */
    public void setTimeout(final boolean isTimeout) {
        this.isTimeout = isTimeout;
    }

    /**
     */
    public ServiceResult() {
    }

    /**
     * @param isSuccess
     */
    public ServiceResult(final boolean isSuccess) {
        super(isSuccess);
    }

    /**
     * @param isSuccess
     * @param data
     */
    public ServiceResult(final boolean isSuccess, final Object data) {
        super(isSuccess, data);
    }

    /**
     * @param isSuccess
     * @param message
     */
    public ServiceResult(final boolean isSuccess, final String message) {
        super(isSuccess, message);
    }

    /**
     * @param isSuccess
     * @param message
     * @param data
     */
    public ServiceResult(final boolean isSuccess, final String message, final Object data) {
        super(isSuccess, message, data);
    }

    /**
     * 默认成功返回
     * @return ServiceResult
     */
    public static ServiceResult success() {
        return new ServiceResult(BaseResult.SUCCESS);
    }

    /**
     * 默认成功并带data
     *
     * @param data
     * @return ServiceResult
     */
    public static ServiceResult success(final Object data) {
        return new ServiceResult(BaseResult.SUCCESS, data);
    }

    /**
     * 默认成功并带message
     * @param message
     * @return ServiceResult
     */
    public static ServiceResult success(final String message) {
        return new ServiceResult(BaseResult.SUCCESS, message);
    }

    /**
     * 默认成功并带message,data
     * @param message
     * @param data
     * @return ServiceResult
     */
    public static ServiceResult success(final String message, final Object data) {
        return new ServiceResult(BaseResult.SUCCESS, message, data);
    }

    /**
     * 默认错误返回
     * @return ServiceResult
     */
    public static ServiceResult error() {
        return new ServiceResult(BaseResult.FAILURE);
    }

    /**
     * 默认错误并带message
     * @param message
     * @return ServiceResult
     */
    public static ServiceResult error(final String message) {
        return new ServiceResult(BaseResult.FAILURE, message);
    }

    /**
     * 默认错误并带message,data
     * @param message
     * @param data
     * @return ServiceResult
     */
    public static ServiceResult error(final String message, final Object data) {
        return new ServiceResult(BaseResult.FAILURE, message, data);
    }

    /**
     * 默认错误返回
     * @param message
     * @param code
     * @return ServiceResult
     */
    public static ServiceResult error(final String message, final String code) {
        ServiceResult result = new ServiceResult(BaseResult.FAILURE);
        result.setMessage(message);
        result.setErrorCode(code);
        return result;
    }

    /**
     * 默认错误并带message,errorCode,data
     * @param message
     * @param errorCode
     * @param data
     * @return ServiceResult
     */
    public static ServiceResult error(final String message, final String errorCode,
                                      final Object data) {
        final ServiceResult result = ServiceResult.error(message, data);
        result.setErrorCode(errorCode);
        return result;
    }

    /**
     * 超时类型的错误返回
     * @return ServiceResult
     */
    public static ServiceResult timeout() {
        final ServiceResult result = new ServiceResult(BaseResult.FAILURE,
            ServiceResult.MSG_TIMEOUT);
        result.setTimeout(true);
        return result;
    }

    /**
     * 超时类型的错误返回
     * @param message
     * @return ServiceResult
     */
    public static ServiceResult timeout(final String message) {
        final ServiceResult result = new ServiceResult(BaseResult.FAILURE, message);
        result.setTimeout(true);
        return result;
    }
}
