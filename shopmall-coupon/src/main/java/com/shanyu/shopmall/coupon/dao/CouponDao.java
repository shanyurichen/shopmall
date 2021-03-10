package com.shanyu.shopmall.coupon.dao;

import com.shanyu.shopmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 10:08:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
