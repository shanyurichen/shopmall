package com.shanyu.shopmall.member.dao;

import com.shanyu.shopmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 10:19:15
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
