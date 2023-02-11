package com.lihaiqiao.gulimall.order.dao;

import com.lihaiqiao.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-10-29 23:00:39
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
