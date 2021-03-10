package com.shanyu.shopmall.ware.dao;

import com.shanyu.shopmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 13:46:14
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
