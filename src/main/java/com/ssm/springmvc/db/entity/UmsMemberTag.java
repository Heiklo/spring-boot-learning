package com.ssm.springmvc.db.entity;

import java.math.BigDecimal;

public class UmsMemberTag {
    private Long id;

    private String name;

    private Integer finishOrderCount;

    private BigDecimal finishOrderAmount;

    public UmsMemberTag(Long id, String name, Integer finishOrderCount, BigDecimal finishOrderAmount) {
        this.id = id;
        this.name = name;
        this.finishOrderCount = finishOrderCount;
        this.finishOrderAmount = finishOrderAmount;
    }

    public UmsMemberTag() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFinishOrderCount() {
        return finishOrderCount;
    }

    public void setFinishOrderCount(Integer finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }
}