package com.shanyu.shopmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shanyu.common.utils.PageUtils;
import com.shanyu.shopmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 10:19:16
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

