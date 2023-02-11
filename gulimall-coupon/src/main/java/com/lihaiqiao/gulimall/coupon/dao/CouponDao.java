package com.lihaiqiao.gulimall.coupon.dao;

import com.lihaiqiao.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-10-29 22:12:08
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
