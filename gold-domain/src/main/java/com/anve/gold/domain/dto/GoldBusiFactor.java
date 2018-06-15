package com.anve.gold.domain.dto;

import java.io.Serializable;

public class GoldBusiFactor implements Serializable {
    private Integer id;

    private Integer subBusiType;

    private Integer factor;

    private String content;

    private Long startTime;

    private Long endTime;

    private Boolean isOpen;

    private Long createdTime;

    private Long updatedTime;

    private String lastOperUser;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubBusiType() {
        return subBusiType;
    }

    public void setSubBusiType(Integer subBusiType) {
        this.subBusiType = subBusiType;
    }

    public Integer getFactor() {
        return factor;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
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

    public String getLastOperUser() {
        return lastOperUser;
    }

    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }
}