package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.Config;

public interface ConfigMapper {
    int deleteByPrimaryKey(String keyword);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(String keyword);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}