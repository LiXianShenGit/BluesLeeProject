package com.lihaiqiao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihaiqiao.gulimall.common.utils.PageUtils;
import com.lihaiqiao.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-10-29 22:12:08
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

