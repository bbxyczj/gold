package com.anve.gold.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by zhengliu on 2018/6/14
 */
@Controller
public class IndexController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
