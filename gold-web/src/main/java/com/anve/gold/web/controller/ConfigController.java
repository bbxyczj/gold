package com.anve.gold.web.controller;

import com.anve.gold.common.bo.Result;
import com.anve.gold.domain.dto.Config;
import com.anve.gold.service.logic.ConfigLogic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * created by zhengliu on 2018/6/15
 */
@RestController
@RequestMapping("config")
public class ConfigController extends BaseController{

    @Resource
    private ConfigLogic configLogic;

    @RequestMapping(value = "get",method = RequestMethod.POST)
    public Result get(String  keyword){
        return success(configLogic.get(keyword));
    }


}
