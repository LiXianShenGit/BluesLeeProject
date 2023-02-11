package com.lihaiqiao.gulimall.product.dao;

import com.lihaiqiao.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-10-18 16:59:36
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
