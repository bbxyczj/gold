package com.anve.gold.domain.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class GoldAccount implements Serializable {
    private Integer id;

    private String cardNum;

    private Integer userId;

    private Integer acctType;

    private BigDecimal balance;

    private BigDecimal availBalance;

    private BigDecimal frozeBalance;

    private Integer status;

    private Boolean deleteFlag;

    private String createTime;

    private String updateTime;

    private Integer acctVersion;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAcctType() {
        return acctType;
    }

    public void setAcctType(Integer acctType) {
        this.acctType = acctType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getAvailBalance() {
        return availBalance;
    }

    public void setAvailBalance(BigDecimal availBalance) {
        this.availBalance = availBalance;
    }

    public BigDecimal getFrozeBalance() {
        return frozeBalance;
    }

    public void setFrozeBalance(BigDecimal frozeBalance) {
        this.frozeBalance = frozeBalance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getAcctVersion() {
        return acctVersion;
    }

    public void setAcctVersion(Integer acctVersion) {
        this.acctVersion = acctVersion;
    }
}