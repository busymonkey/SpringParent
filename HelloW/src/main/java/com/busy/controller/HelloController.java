package com.busy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Description
 * @Date 2019/8/15 2:18
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/test1")
    public String test() {
        return "TestController";
    }
}
