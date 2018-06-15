package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldScoreOperator;

public interface GoldScoreOperatorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoldScoreOperator record);

    int insertSelective(GoldScoreOperator record);

    GoldScoreOperator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoldScoreOperator record);

    int updateByPrimaryKey(GoldScoreOperator record);
}