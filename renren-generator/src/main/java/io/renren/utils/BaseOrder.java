/**
 * DongJun.com Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package io.renren.utils;

import java.util.Map;

/**
 * 排序统一绑定参数类
 *
 * @author jinyiding
 * @version $Id: BaseOrder.java, v 0.1 2015年12月27日 下午4:32:49 jinyiding Exp $
 */
public class BaseOrder {

    /**
     * 排序方式参数统一map
     */
    private Map<String, EnumOrderBy> orderByMap;

    /**
     * Getter method for property <tt>orderByMap</tt>.
     *
     * @return property value of orderByMap
     */
    public Map<String, EnumOrderBy> getOrderByMap() {
        return this.orderByMap;
    }

    /**
     * Setter method for property <tt>orderByMap</tt>.
     *
     * @param orderByMap value to be assigned to property orderByMap
     */
    public void setOrderByMap(final Map<String, EnumOrderBy> orderByMap) {
        this.orderByMap = orderByMap;
    }

}
