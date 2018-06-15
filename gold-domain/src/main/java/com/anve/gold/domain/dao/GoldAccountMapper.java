package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldAccount;

public interface GoldAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoldAccount record);

    int insertSelective(GoldAccount record);

    GoldAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoldAccount record);

    int updateByPrimaryKey(GoldAccount record);
}