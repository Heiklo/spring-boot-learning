package com.ssm.springmvc.db.entity;

public class UmsIntegrationConsumeSetting {
    private Long id;

    private Integer deductionPerAmount;

    private Integer maxPercentPerOrder;

    private Integer useUnit;

    private Integer couponStatus;

    public UmsIntegrationConsumeSetting(Long id, Integer deductionPerAmount, Integer maxPercentPerOrder, Integer useUnit, Integer couponStatus) {
        this.id = id;
        this.deductionPerAmount = deductionPerAmount;
        this.maxPercentPerOrder = maxPercentPerOrder;
        this.useUnit = useUnit;
        this.couponStatus = couponStatus;
    }

    public UmsIntegrationConsumeSetting() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDeductionPerAmount() {
        return deductionPerAmount;
    }

    public void setDeductionPerAmount(Integer deductionPerAmount) {
        this.deductionPerAmount = deductionPerAmount;
    }

    public Integer getMaxPercentPerOrder() {
        return maxPercentPerOrder;
    }

    public void setMaxPercentPerOrder(Integer maxPercentPerOrder) {
        this.maxPercentPerOrder = maxPercentPerOrder;
    }

    public Integer getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(Integer useUnit) {
        this.useUnit = useUnit;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }
}