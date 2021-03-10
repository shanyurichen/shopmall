package com.shanyu.shopmall.coupon.dao;

import com.shanyu.shopmall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 10:08:26
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
