package com.shanyu.shopmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shanyu.common.utils.PageUtils;
import com.shanyu.shopmall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-09 16:05:42
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

