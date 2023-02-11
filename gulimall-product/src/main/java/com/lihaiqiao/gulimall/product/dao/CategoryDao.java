package com.lihaiqiao.gulimall.product.dao;

import com.lihaiqiao.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-10-18 16:59:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
