package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldBusiFactor;

public interface GoldBusiFactorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoldBusiFactor record);

    int insertSelective(GoldBusiFactor record);

    GoldBusiFactor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoldBusiFactor record);

    int updateByPrimaryKey(GoldBusiFactor record);
}