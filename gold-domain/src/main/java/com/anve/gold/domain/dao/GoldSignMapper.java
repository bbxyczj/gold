package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldSign;

public interface GoldSignMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoldSign record);

    int insertSelective(GoldSign record);

    GoldSign selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoldSign record);

    int updateByPrimaryKey(GoldSign record);
}