package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldScoreGift;

public interface GoldScoreGiftMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoldScoreGift record);

    int insertSelective(GoldScoreGift record);

    GoldScoreGift selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoldScoreGift record);

    int updateByPrimaryKey(GoldScoreGift record);
}