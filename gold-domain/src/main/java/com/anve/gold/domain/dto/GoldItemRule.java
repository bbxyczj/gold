package com.anve.gold.domain.dto;

import java.io.Serializable;

public class GoldItemRule implements Serializable {
    private Long id;

    private Long createdTime;

    private Long updatedTime;

    private Integer subBusiType;

    private Long itemId;

    private Integer factor;

    private Integer consumeVal;

    private Long startTime;

    private Long endTime;

    private String activityInfo;

    private Boolean isOpen;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getSubBusiType() {
        return subBusiType;
    }

    public void setSubBusiType(Integer subBusiType) {
        this.subBusiType = subBusiType;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getFactor() {
        return factor;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
    }

    public Integer getConsumeVal() {
        return consumeVal;
    }

    public void setConsumeVal(Integer consumeVal) {
        this.consumeVal = consumeVal;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getActivityInfo() {
        return activityInfo;
    }

    public void setActivityInfo(String activityInfo) {
        this.activityInfo = activityInfo;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }
}