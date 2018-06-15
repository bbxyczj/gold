package com.anve.gold.domain.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoldSign implements Serializable {
    private Long id;

    private Date signDate;

    private Long userId;

    private Integer signType;

    private BigDecimal goldChange;

    private Integer couponId;

    private Integer couponType;

    private String couponDetail;

    private Integer factor;

    private Boolean isDouble;

    private Boolean especialSuccess;

    private Boolean isEspecial;

    private Boolean isDel;

    private Boolean isLast;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    public BigDecimal getGoldChange() {
        return goldChange;
    }

    public void setGoldChange(BigDecimal goldChange) {
        this.goldChange = goldChange;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getCouponDetail() {
        return couponDetail;
    }

    public void setCouponDetail(String couponDetail) {
        this.couponDetail = couponDetail;
    }

    public Integer getFactor() {
        return factor;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
    }

    public Boolean getIsDouble() {
        return isDouble;
    }

    public void setIsDouble(Boolean isDouble) {
        this.isDouble = isDouble;
    }

    public Boolean getEspecialSuccess() {
        return especialSuccess;
    }

    public void setEspecialSuccess(Boolean especialSuccess) {
        this.especialSuccess = especialSuccess;
    }

    public Boolean getIsEspecial() {
        return isEspecial;
    }

    public void setIsEspecial(Boolean isEspecial) {
        this.isEspecial = isEspecial;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Boolean getIsLast() {
        return isLast;
    }

    public void setIsLast(Boolean isLast) {
        this.isLast = isLast;
    }
}