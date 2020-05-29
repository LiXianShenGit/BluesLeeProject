package com.lihaiqiao.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr Li
 * @date 2020-05-29下午 01:11
 */
@RestController
public class TestController {

    @RequestMapping("/getStr")
    public String getStr() {
        return "lihaiqiao(●'◡'●)";
    }
}
