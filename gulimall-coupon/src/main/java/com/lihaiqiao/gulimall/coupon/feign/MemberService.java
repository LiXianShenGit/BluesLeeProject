package com.lihaiqiao.gulimall.coupon.feign;

import com.lihaiqiao.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mr Li
 * @date 2020-11-21下午 07:39
 */
@FeignClient("gulimall-member")
public interface MemberService {

    @RequestMapping("/member/member/list/members")
   public R queryMembers();
}
