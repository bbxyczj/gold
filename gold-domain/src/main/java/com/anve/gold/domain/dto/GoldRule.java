package com.anve.gold.domain.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class GoldRule implements Serializable {
    private Long id;

    private Long createdTime;

    private Long updatedTime;

    private Integer busiType;

    private Integer ruleType;

    private BigDecimal val;

    private BigDecimal basePlan;

    private BigDecimal lowerVal;

    private String lastOperUser;

    private Boolean delFlag;

    private Boolean open;

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

    public Integer getBusiType() {
        return busiType;
    }

    public void setBusiType(Integer busiType) {
        this.busiType = busiType;
    }

    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public BigDecimal getVal() {
        return val;
    }

    public void setVal(BigDecimal val) {
        this.val = val;
    }

    public BigDecimal getBasePlan() {
        return basePlan;
    }

    public void setBasePlan(BigDecimal basePlan) {
        this.basePlan = basePlan;
    }

    public BigDecimal getLowerVal() {
        return lowerVal;
    }

    public void setLowerVal(BigDecimal lowerVal) {
        this.lowerVal = lowerVal;
    }

    public String getLastOperUser() {
        return lastOperUser;
    }

    public void setLastOperUser(String lastOperUser) {
        this.lastOperUser = lastOperUser;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }
}