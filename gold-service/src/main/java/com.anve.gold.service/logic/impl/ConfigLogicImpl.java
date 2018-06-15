package com.anve.gold.service.logic.impl;

import com.anve.gold.domain.dao.ConfigMapper;
import com.anve.gold.domain.dto.Config;
import com.anve.gold.service.logic.ConfigLogic;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * created by zhengliu on 2018/6/15
 */
@Service
public class ConfigLogicImpl implements ConfigLogic{

    @Resource
    private ConfigMapper configMapper;

    @Override
    public Config get(String keyword) {
        return configMapper.selectByPrimaryKey(keyword);
    }
}
