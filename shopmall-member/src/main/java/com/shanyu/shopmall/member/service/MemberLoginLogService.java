package com.shanyu.shopmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shanyu.common.utils.PageUtils;
import com.shanyu.shopmall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 10:19:15
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

