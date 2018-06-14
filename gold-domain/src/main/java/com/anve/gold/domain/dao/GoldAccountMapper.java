package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldAccount;

public interface GoldAccountMapper {
    int insert(GoldAccount record);

    int insertSelective(GoldAccount record);
}