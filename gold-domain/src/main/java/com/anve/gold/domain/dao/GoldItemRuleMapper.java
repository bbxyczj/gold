package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldItemRule;

public interface GoldItemRuleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoldItemRule record);

    int insertSelective(GoldItemRule record);

    GoldItemRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoldItemRule record);

    int updateByPrimaryKey(GoldItemRule record);
}