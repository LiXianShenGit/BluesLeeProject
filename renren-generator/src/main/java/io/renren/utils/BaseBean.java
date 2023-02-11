package io.renren.utils;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * BaseBean
 * @author CWJ
 * @version $Id: BaseBean.java, v 0.1 2015年10月12日 下午5:09:34 CWJ Exp $
 */
public class BaseBean extends Pagination implements Serializable {

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

    private List<BigInteger>  parentMerchantIds;

    private List<BigInteger>  childMerchantIds;

    /**
     * Getter method for property <tt>createUserId</tt>.
     *
     * @return property value of createUserId
     */
    public BigInteger getCreateUserId() {
        return this.createUserId;
    }

    /**
     * Setter method for property <tt>createUserId</tt>.
     *
     * @param createUserId value to be assigned to property createUserId
     */
    public void setCreateUserId(final BigInteger createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * Getter method for property <tt>updateUserId</tt>.
     *
     * @return property value of updateUserId
     */
    public BigInteger getUpdateUserId() {
        return this.updateUserId;
    }

    /**
     * Setter method for property <tt>updateUserId</tt>.
     *
     * @param updateUserId value to be assigned to property updateUserId
     */
    public void setUpdateUserId(final BigInteger updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public BigInteger getId() {
        return this.id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(final BigInteger id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>createDate</tt>.
     *
     * @return property value of createDate
     */
    public Date getCreateDate() {
        return this.createDate;
    }

    /**
     * Setter method for property <tt>createDate</tt>.
     *
     * @param createDate value to be assigned to property createDate
     */
    public void setCreateDate(final Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Getter method for property <tt>updateDate</tt>.
     *
     * @return property value of updateDate
     */
    public Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * Setter method for property <tt>updateDate</tt>.
     *
     * @param updateDate value to be assigned to property updateDate
     */
    public void setUpdateDate(final Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Getter method for property <tt>parentMerchantIds</tt>.
     *
     * @return property value of parentMerchantIds
     */
    public List<BigInteger> getParentMerchantIds() {
        return this.parentMerchantIds;
    }

    /**
     * Getter method for property <tt>childMerchantIds</tt>.
     *
     * @return property value of childMerchantIds
     */
    public List<BigInteger> getChildMerchantIds() {
        return this.childMerchantIds;
    }

    /**
     * Setter method for property <tt>parentMerchantIds</tt>.
     *
     * @param parentMerchantIds value to be assigned to property parentMerchantIds
     */
    public void setParentMerchantIds(List<BigInteger> parentMerchantIds) {
        this.parentMerchantIds = parentMerchantIds;
    }

    /**
     * Setter method for property <tt>childMerchantIds</tt>.
     *
     * @param childMerchantIds value to be assigned to property childMerchantIds
     */
    public void setChildMerchantIds(List<BigInteger> childMerchantIds) {
        this.childMerchantIds = childMerchantIds;
    }

}
