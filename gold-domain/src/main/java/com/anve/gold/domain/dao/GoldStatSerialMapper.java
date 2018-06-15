package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldStatSerial;

public interface GoldStatSerialMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoldStatSerial record);

    int insertSelective(GoldStatSerial record);

    GoldStatSerial selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoldStatSerial record);

    int updateByPrimaryKey(GoldStatSerial record);
}