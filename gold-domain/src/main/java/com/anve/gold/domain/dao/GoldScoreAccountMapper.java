package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldScoreAccount;

public interface GoldScoreAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoldScoreAccount record);

    int insertSelective(GoldScoreAccount record);

    GoldScoreAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoldScoreAccount record);

    int updateByPrimaryKey(GoldScoreAccount record);
}