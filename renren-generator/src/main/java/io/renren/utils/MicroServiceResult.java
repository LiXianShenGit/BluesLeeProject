package io.renren.utils;

/**
 * 控制层返回封装,可自己扩展
 * @author jinyiding
 * @version $Id: ControllerResult.java, v 0.1 2015年7月19日 上午11:58:22 jinyiding Exp $
 */

public class MicroServiceResult<T> extends BaseWebResult<T> {

    /**  */
    private static final long serialVersionUID = -7656777736833501313L;

    public MicroServiceResult() {
        super();
    }

    /**
     * @param isSuccess
     * @param message
     * @param data
     */
    public MicroServiceResult(final boolean isSuccess, final int errorCode, final String message,
                              final T data) {
        super(isSuccess, errorCode, message, data);
    }

    /**
     * @param isSuccess
     * @param message
     * @param data
     */
    public MicroServiceResult(final boolean isSuccess, final String message, final T data) {
        super(isSuccess, message, data);
    }

    /**
     * @param isSuccess
     * @param message
     */
    public MicroServiceResult(final boolean isSuccess, final String message) {
        super(isSuccess, message);
    }

    /**
     * @param isSuccess
     * @param data
     */
    public MicroServiceResult(final boolean isSuccess, final T data) {
        super(isSuccess, data);
    }

    /**
     * @param isSuccess
     */
    public MicroServiceResult(final boolean isSuccess) {
        super(isSuccess);
    }

    /**
     *
     * @author zhangguoping
     * @date 2019/8/16 10:12
     * @param errorCode
     * @param message
     * @exception
     * @return  {@link }
     */
    public MicroServiceResult(final boolean success, final int errorCode, final String message) {
        super(success, errorCode, message);
    }

    /**
     * 默认成功返回, 调用:ControllerResult.success();
     * @return ControllerResult
     */
    public static MicroServiceResult success() {
        return new MicroServiceResult(BaseWebResult.SUCCESS);
    }

    /**
     * 默认成功并带message, 调用:ControllerResult.success("xxx");
     * @param message
     * @return ControllerResult
     */
    public static MicroServiceResult success(final String message) {
        return new MicroServiceResult(BaseWebResult.SUCCESS, message);
    }

    /**
     * 默认成功并带data
     * @param data
     * @return ControllerResult
     */
    public static <T> MicroServiceResult<T> successData(final T data) {
        return new MicroServiceResult<>(BaseWebResult.SUCCESS, data);
    }

    /**
     * 默认成功并带message,data, 调用:ControllerResult.success("xxx", Txxx);
     * @param message
     * @param data
     * @return ControllerResult
     */
    public static <T> MicroServiceResult<T> success(final String message, final T data) {
        return new MicroServiceResult<>(BaseWebResult.SUCCESS, message, data);
    }

    /**
     * 默认错误返回
     * @return ControllerResult
     */
    public static MicroServiceResult error() {
        return new MicroServiceResult<>(BaseWebResult.FAILURE);
    }

    /**
     * 默认错误并带message
     * @param message
     * @return ControllerResult
     */
    public static MicroServiceResult error(final String message) {
        return new MicroServiceResult(BaseWebResult.FAILURE, message);
    }

    /**
     * 默认错误并带message
     * @param message
     * @return ControllerResult
     */
    public static MicroServiceResult error(final int errorCode, final String message) {
        return new MicroServiceResult<>(BaseWebResult.FAILURE, errorCode, message);
    }

    /**
     * 默认错误并带message,data
     * @param message
     * @param data
     * @return ControllerResult
     */
    public static <T> MicroServiceResult<T> error(final String message, final T data) {
        return new MicroServiceResult<>(BaseWebResult.FAILURE, message, data);
    }

    /**
     * 默认错误并带message,data
     * @param data
     * @param message
     * 
     * @return ControllerResult
     */
    public static <T> MicroServiceResult<T> error(final int errorCode, final T data,
                                                  final String message) {
        return new MicroServiceResult<>(BaseWebResult.FAILURE, errorCode, message, data);
    }
}
