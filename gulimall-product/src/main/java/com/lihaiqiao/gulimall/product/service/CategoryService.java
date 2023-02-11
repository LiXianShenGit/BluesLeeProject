package com.lihaiqiao.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihaiqiao.gulimall.common.utils.PageUtils;
import com.lihaiqiao.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-10-18 16:59:36
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

