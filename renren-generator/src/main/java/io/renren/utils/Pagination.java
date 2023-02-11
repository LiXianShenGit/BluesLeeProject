/**
 * DongJun.com Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package io.renren.utils;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 分页基类
 *
 * @author jinyiding
 * @version $Id: Pagination.java, v 0.1 2016年6月13日 下午2:17:32 jinyiding Exp $
 */
public class Pagination extends BaseOrder {

    /**
     * 默认每页10条
     */
    private final BigInteger DEF_PAGE_VIEW_SIZE = BigInteger.TEN;

    /** 当前页 */
    private BigInteger       page;

    /** 当前页显示记录条数 */
    private BigInteger       pageSize;

    /** 取得查询总记录数 */
    private BigInteger       count;

    @SuppressWarnings("rawtypes")
    List                     records            = Collections.emptyList();

    private BigInteger       pages;

    /** scroll方式的加载起始数 */
    private BigInteger       recordStart;

    /** scroll方式的加载结束数 */
    private BigInteger       recordEnd;

    /**
     *
     */
    public Pagination() {
    }

    /**
     * 根据当前显示页与每页显示记录数设置查询信息初始对象
     *
     * @param page 当前显示页号
     * @param pageSize 当前页显示记录条数
     */
    public Pagination(final BigInteger page, final BigInteger pageSize) {
        this.page = ((page == null) || (page.compareTo(BigInteger.ZERO) <= 0)) ? BigInteger.ONE
            : page;
        this.pageSize = ((pageSize == null) || (pageSize.compareTo(BigInteger.ZERO) <= 0)) ? this.DEF_PAGE_VIEW_SIZE
            : pageSize;
    }

    /**
     * 取得当前显示页号
     *
     * @return 当前显示页号
     */
    public BigInteger getPage() {
        return ((this.page == null) || (this.page.compareTo(BigInteger.ZERO) <= 0)) ? BigInteger.ONE
            : this.page;
    }

    /**
     * 设置当前页
     *
     * @param page 当前页
     */
    public void setPage(final BigInteger page) {
        this.page = page;
    }

    /**
     * 取得当前显示页号最多显示条数
     *
     * @return 当前显示页号最多显示条数
     */
    public BigInteger getPageSize() {
        return ((this.pageSize == null) || (this.pageSize.compareTo(BigInteger.ZERO) <= 0)) ? this.DEF_PAGE_VIEW_SIZE
            : this.pageSize;
    }

    /**
     * 设置当前页显示记录条数
     *
     * @param pageSize 当前页显示记录条数
     */
    public void setPageSize(final BigInteger pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 取得当前查询总页数
     * @return 当前查询总页数
     */
    public BigInteger getPages() {
        final BigInteger total = this.getCount().add(this.getPageSize()).subtract(BigInteger.ONE);
        return this.pages != null ? this.pages : total.divide(this.getPageSize());
    }

    /**
     * 取得起始显示记录号
     * @return 起始显示记录号
     */
    @JsonIgnore
    public BigInteger getStartNo() {
        return this.getPage().subtract(BigInteger.ONE).multiply(this.getPageSize())
                .add(BigInteger.ONE);
    }

    /**
     * 取得结束显示记录号
     * @return 结束显示记录号
     */
    @JsonIgnore
    public BigInteger getEndNo() {
        final BigInteger currentCount = this.getPage().multiply(this.getPageSize());
        return currentCount.compareTo(this.getCount()) <= 0 ? currentCount : this.getCount();
    }

    /**
     * 取得前一显示页码
     * @return 前一显示页码
     */
    @JsonIgnore
    public BigInteger getPrePageNo() {
        final BigInteger targetPage = this.getPage().subtract(BigInteger.ONE);
        return targetPage.compareTo(BigInteger.ONE) >= 0 ? targetPage : BigInteger.ONE;
    }

    /**
     * 取得后一显示页码
     *
     * @return 后一显示页码
     */
    @JsonIgnore
    public BigInteger getNextPageNo() {
        final BigInteger targetPage = this.getPage().add(BigInteger.ONE);
        return targetPage.compareTo(this.getPages()) <= 0 ? targetPage : this.getPages();
    }

    /**
     * 取得结果集
     *
     * @return 结果集
     */
    @SuppressWarnings("rawtypes")
    public List getRecords() {
        return this.records;
    }

    /**
     * 设置结果集
     *
     * @param records
     */
    @SuppressWarnings("rawtypes")
    public void setRecords(final List records) {
        this.records = records;
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
     *
     * @return BigInteger
     */
    public BigInteger getCount() {
        return this.count == null ? BigInteger.ZERO : this.count;
    }

    /**
     *
     * @param pages
     */
    public void setPages(final BigInteger pages) {
        this.pages = pages;
    }

    /**
     * Getter method for property <tt>recordStart</tt>.
     *
     * @return property value of recordStart
     */
    public BigInteger getRecordStart() {
        return this.recordStart;
    }

    /**
     * Setter method for property <tt>recordStart</tt>.
     *
     * @param recordStart value to be assigned to property recordStart
     */
    public void setRecordStart(final BigInteger recordStart) {
        this.recordStart = recordStart;
    }

    /**
     * Getter method for property <tt>recordEnd</tt>.
     *
     * @return property value of recordEnd
     */
    public BigInteger getRecordEnd() {
        return this.recordEnd;
    }

    /**
     * Setter method for property <tt>recordEnd</tt>.
     *
     * @param recordEnd value to be assigned to property recordEnd
     */
    public void setRecordEnd(final BigInteger recordEnd) {
        this.recordEnd = recordEnd;
    }

}
