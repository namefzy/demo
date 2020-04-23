package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuzy
 * @version 1.0
 * @Description
 * @company 上海有分科技发展有限公司
 * @email fuzy@ufen.cn
 * @date 2020/4/23 19:37
 */
@RestController
public class DemoController {
    @GetMapping("/demo")
    public String demo(){
        return "Hello World!";
    }
}
