package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldScoreOrder;

public interface GoldScoreOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoldScoreOrder record);

    int insertSelective(GoldScoreOrder record);

    GoldScoreOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoldScoreOrder record);

    int updateByPrimaryKey(GoldScoreOrder record);
}