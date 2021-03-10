package com.shanyu.shopmall.order.dao;

import com.shanyu.shopmall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 13:26:26
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
