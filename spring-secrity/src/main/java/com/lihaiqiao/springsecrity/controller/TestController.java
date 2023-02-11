package com.lihaiqiao.springsecrity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mr Li
 * @date 2021-06-27下午 03:36
 */
@Controller("/admin")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "1223";
    }
}
