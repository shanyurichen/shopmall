package com.shanyu.shopmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shanyu.common.utils.PageUtils;
import com.shanyu.shopmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 10:08:26
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

