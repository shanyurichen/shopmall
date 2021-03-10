package com.shanyu.shopmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shanyu.common.utils.PageUtils;
import com.shanyu.shopmall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author shanyu
 * @email ou.rj@qq.com
 * @date 2021-03-10 10:19:16
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

