package com.lihaiqiao.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihaiqiao.gulimall.common.utils.PageUtils;
import com.lihaiqiao.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-10-29 23:00:39
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

