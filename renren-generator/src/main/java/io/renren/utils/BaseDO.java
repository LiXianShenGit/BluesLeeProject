package io.renren.utils;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * BaseBean
 * @author CWJ
 * @version $Id: BaseBean.java, v 0.1 2015年10月12日 下午5:09:34 CWJ Exp $
 */
@Data
public class BaseDO implements Serializable {

    /**  */
    private static final long serialVersionUID = -4149097455591969990L;

    /**
     * id
     */
    private BigInteger        id;

    /**
     * 创建时间
     */
    private Date              createDate;

    /**
     * 修改时间
     */
    private Date              updateDate;
    /**
     * 创建人ID
     */
    private BigInteger        createUserId;
    /**
     * 更新人ID
     */
    private BigInteger        updateUserId;

}
