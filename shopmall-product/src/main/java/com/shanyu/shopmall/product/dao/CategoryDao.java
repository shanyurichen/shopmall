package com.shanyu.shopmall.product.dao;

import com.shanyu.shopmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-09 16:05:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
