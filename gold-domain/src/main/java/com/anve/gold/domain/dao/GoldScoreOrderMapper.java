package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldScoreOrder;

public interface GoldScoreOrderMapper {
    int insert(GoldScoreOrder record);

    int insertSelective(GoldScoreOrder record);
}