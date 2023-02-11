package io.renren.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * service基类
 *
 * @author jinyiding
 * @version $Id: BaseService.java, v 0.1 2016年6月13日 下午2:51:46 jinyiding Exp $
 */
public abstract class BaseService {

    protected Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * ServiceResult错误码 - 系统异常
     */
    public static final String ERR_CD_DEFAULT = "e_0";
    /**
     * ServiceResult错误码 - 参数非法
     */
    protected static final String ERR_CD_ARGS = "e_args_0";
    /**
     * ServiceResult错误码 - 设备不存在或非法
     */
    protected static final String ERR_CD_EQUIP = "e_equip_0";
    /**
     * ServiceResult错误码 - insert异常
     */
    protected static final String ERR_CD_INSERT = "e_insert";
    /**
     * ServiceResult错误码 - update异常
     */
    protected static final String ERR_CD_UPDATE = "e_update";
    /**
     * ServiceResult错误码 - update影响条数0
     */
    protected static final String ERR_CD_UPDATE_NONE = "e_update_0";
    /**
     * ServiceResult错误码 - update影响条数过多
     */
    protected static final String ERR_CD_UPDATE_MORE = "e_update_1";
    /**
     * ServiceResult错误码 - delete异常
     */
    public static final String ERR_CD_DELETE = "e_delete";
    /**
     * ServiceResult错误码 - delete影响条数0
     */
    public static final String ERR_CD_DELETE_NONE = "e_delete_0";
    /**
     * ServiceResult错误码 - delete影响条数过多
     */
    public static final String ERR_CD_DELETE_MORE = "e_delete_1";

    /**
     * 默认service 参数非法返回
     */
    protected static final ServiceResult ILLEGAL_ARGS = ServiceResult.error("参数非法",
            ERR_CD_ARGS);

    /**
     * 默认service 设备非法返回
     */
    protected static final ServiceResult ILLEGAL_EQUIP = ServiceResult.error("设备非法",
            ERR_CD_EQUIP);

    /**
     * 默认service成功返回
     */
    protected static final ServiceResult SERVICE_SUCCESS = ServiceResult.success();

    /**
     * 默认service错误返回
     */
    protected static final ServiceResult SERVICE_ERROR = ServiceResult.error();

    protected ServiceResult getErrorResult(final String errorCode) {
        final ServiceResult error = ServiceResult.error();
        error.setErrorCode(errorCode);
        return error;
    }

    /**
     * 组装统一的分页返回
     *
     * @param pagination
     * @param records
     * @return PageResult
     */
    protected <T> PageResult<T> buildPageResult(final Pagination pagination,
                                                final List<T> records) {
        return new PageResult<>(pagination.getPage(), pagination.getPageSize(),
                pagination.getCount(), records);
    }

}
