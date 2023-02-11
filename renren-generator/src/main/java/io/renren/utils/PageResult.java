/**
 * DongJun.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package io.renren.utils;


import java.math.BigInteger;
import java.util.List;

/**
 * 分页返回对象
 * @author jinyiding
 * @version $Id: BasePageResult.java, v 0.1 2019年2月28日 下午4:31:46 jinyiding Exp $
 * @param <T>
 */
/*@ApiModel(description = "分页对象")*/
public class PageResult<T> {

    private BigInteger page;

    private BigInteger pageSize;

    private BigInteger count;

    private List<T>    records;

    /**
     *
     */
    public PageResult() {
        super();
    }

    /**
     * @param count
     * @param records
     */
    public PageResult(final BigInteger count, final List<T> records) {
        super();
        this.count = count;
        this.records = records;
    }

    /**
     * @param page
     * @param pageSize
     * @param count
     * @param records
     */
    public PageResult(final BigInteger page, final BigInteger pageSize, final BigInteger count,
                      final List<T> records) {
        super();
        this.page = page;
        this.pageSize = pageSize;
        this.count = count;
        this.records = records;
    }

    /**
     * Getter method for property <tt>page</tt>.
     *
     * @return property value of page
     */
    public BigInteger getPage() {
        return this.page;
    }

    /**
     * Setter method for property <tt>page</tt>.
     *
     * @param page value to be assigned to property page
     */
    public void setPage(final BigInteger page) {
        this.page = page;
    }

    /**
     * Getter method for property <tt>pageSize</tt>.
     *
     * @return property value of pageSize
     */
    public BigInteger getPageSize() {
        return this.pageSize;
    }

    /**
     * Setter method for property <tt>pageSize</tt>.
     *
     * @param pageSize value to be assigned to property pageSize
     */
    public void setPageSize(final BigInteger pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter method for property <tt>count</tt>.
     *
     * @return property value of count
     */
    public BigInteger getCount() {
        return this.count;
    }

    /**
     * Setter method for property <tt>count</tt>.
     *
     * @param count value to be assigned to property count
     */
    public void setCount(final BigInteger count) {
        this.count = count;
    }

    /**
     * Getter method for property <tt>records</tt>.
     *
     * @return property value of records
     */
    public List<T> getRecords() {
        return this.records;
    }

    /**
     * Setter method for property <tt>records</tt>.
     *
     * @param records value to be assigned to property records
     */
    public void setRecords(final List<T> records) {
        this.records = records;
    }

}
