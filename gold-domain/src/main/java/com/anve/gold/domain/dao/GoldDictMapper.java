package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldDict;

public interface GoldDictMapper {
    int insert(GoldDict record);

    int insertSelective(GoldDict record);
}