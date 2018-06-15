package com.anve.gold.domain.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoldStatSerial implements Serializable {
    private Long id;

    private Long createdTime;

    private Long updateTime;

    private Date statDate;

    private Integer subBusiType;

    private BigDecimal send;

    private BigDecimal used;

    private BigDecimal refund;

    private BigDecimal cancel;

    private BigDecimal totalSend;

    private BigDecimal totalUse;

    private BigDecimal radio;

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

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public Integer getSubBusiType() {
        return subBusiType;
    }

    public void setSubBusiType(Integer subBusiType) {
        this.subBusiType = subBusiType;
    }

    public BigDecimal getSend() {
        return send;
    }

    public void setSend(BigDecimal send) {
        this.send = send;
    }

    public BigDecimal getUsed() {
        return used;
    }

    public void setUsed(BigDecimal used) {
        this.used = used;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public BigDecimal getCancel() {
        return cancel;
    }

    public void setCancel(BigDecimal cancel) {
        this.cancel = cancel;
    }

    public BigDecimal getTotalSend() {
        return totalSend;
    }

    public void setTotalSend(BigDecimal totalSend) {
        this.totalSend = totalSend;
    }

    public BigDecimal getTotalUse() {
        return totalUse;
    }

    public void setTotalUse(BigDecimal totalUse) {
        this.totalUse = totalUse;
    }

    public BigDecimal getRadio() {
        return radio;
    }

    public void setRadio(BigDecimal radio) {
        this.radio = radio;
    }
}