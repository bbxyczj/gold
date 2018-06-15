package com.anve.gold.web.controller;

import com.anve.gold.common.exception.GoldException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by zhengliu on 2018/6/14
 */
@Controller
public class IndexController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/getMo")
    public String getMo(int i){
        return i%30+"";
    }

    @ResponseBody
    @RequestMapping("/getEx")
    public String getEx() throws GoldException {
        throw new GoldException("系统异常","0001");
    }




}
