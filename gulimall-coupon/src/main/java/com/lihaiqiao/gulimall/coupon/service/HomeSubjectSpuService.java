package com.lihaiqiao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihaiqiao.gulimall.common.utils.PageUtils;
import com.lihaiqiao.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-10-29 22:12:08
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

