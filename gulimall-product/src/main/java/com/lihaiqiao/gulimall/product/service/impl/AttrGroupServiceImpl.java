package com.lihaiqiao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihaiqiao.gulimall.common.utils.PageUtils;
import com.lihaiqiao.gulimall.common.utils.Query;
import com.lihaiqiao.gulimall.product.dao.AttrGroupDao;
import com.lihaiqiao.gulimall.product.entity.AttrGroupEntity;
import com.lihaiqiao.gulimall.product.service.AttrGroupService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }
}