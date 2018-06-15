package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldRule;

public interface GoldRuleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoldRule record);

    int insertSelective(GoldRule record);

    GoldRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoldRule record);

    int updateByPrimaryKey(GoldRule record);
}