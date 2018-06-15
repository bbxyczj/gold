package com.anve.gold.domain.dao;

import com.anve.gold.domain.dto.GoldNotice;

public interface GoldNoticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoldNotice record);

    int insertSelective(GoldNotice record);

    GoldNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoldNotice record);

    int updateByPrimaryKey(GoldNotice record);
}