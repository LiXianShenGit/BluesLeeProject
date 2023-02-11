package com.lihaiqiao.gulimall.member.dao;

import com.lihaiqiao.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-11-21 20:20:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
