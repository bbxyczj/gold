package com.anve.gold.domain.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class GoldSerial implements Serializable {
    private Integer id;

    private String serialNo;

    private Integer serialType;

    private Integer userId;

    private String cardNum;

    private Integer acctType;

    private Boolean cdFlag;

    private BigDecimal amount;

    private BigDecimal balance;

    private String busiType;

    private String subBusiType;

    private String busiSeqNo;

    private BigDecimal busiAmount;

    private String busiDesc;

    private String summary;

    private Integer status;

    private String createTime;

    private String updateTime;

    private Boolean deleteFlag;

    private String oriSerialNo;

    private String payOrderNo;

    private BigDecimal refundedAmount;

    private String sysId;

    private Long frozetIme;

    private String refundId;

    private Integer busiFactor;

    private Boolean itemFactor;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Integer getSerialType() {
        return serialType;
    }

    public void setSerialType(Integer serialType) {
        this.serialType = serialType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Integer getAcctType() {
        return acctType;
    }

    public void setAcctType(Integer acctType) {
        this.acctType = acctType;
    }

    public Boolean getCdFlag() {
        return cdFlag;
    }

    public void setCdFlag(Boolean cdFlag) {
        this.cdFlag = cdFlag;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getSubBusiType() {
        return subBusiType;
    }

    public void setSubBusiType(String subBusiType) {
        this.subBusiType = subBusiType;
    }

    public String getBusiSeqNo() {
        return busiSeqNo;
    }

    public void setBusiSeqNo(String busiSeqNo) {
        this.busiSeqNo = busiSeqNo;
    }

    public BigDecimal getBusiAmount() {
        return busiAmount;
    }

    public void setBusiAmount(BigDecimal busiAmount) {
        this.busiAmount = busiAmount;
    }

    public String getBusiDesc() {
        return busiDesc;
    }

    public void setBusiDesc(String busiDesc) {
        this.busiDesc = busiDesc;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getOriSerialNo() {
        return oriSerialNo;
    }

    public void setOriSerialNo(String oriSerialNo) {
        this.oriSerialNo = oriSerialNo;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public BigDecimal getRefundedAmount() {
        return refundedAmount;
    }

    public void setRefundedAmount(BigDecimal refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public Long getFrozetIme() {
        return frozetIme;
    }

    public void setFrozetIme(Long frozetIme) {
        this.frozetIme = frozetIme;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Integer getBusiFactor() {
        return busiFactor;
    }

    public void setBusiFactor(Integer busiFactor) {
        this.busiFactor = busiFactor;
    }

    public Boolean getItemFactor() {
        return itemFactor;
    }

    public void setItemFactor(Boolean itemFactor) {
        this.itemFactor = itemFactor;
    }
}