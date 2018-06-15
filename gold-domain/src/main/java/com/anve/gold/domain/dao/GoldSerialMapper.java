package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldSerial;

public interface GoldSerialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoldSerial record);

    int insertSelective(GoldSerial record);

    GoldSerial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoldSerial record);

    int updateByPrimaryKey(GoldSerial record);
}