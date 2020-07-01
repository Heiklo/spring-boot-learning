package com.ssm.springmvc.db.entity;

import java.math.BigDecimal;

public class PmsProductFullReduction {
    private Long id;

    private Long productId;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;

    public PmsProductFullReduction(Long id, Long productId, BigDecimal fullPrice, BigDecimal reducePrice) {
        this.id = id;
        this.productId = productId;
        this.fullPrice = fullPrice;
        this.reducePrice = reducePrice;
    }

    public PmsProductFullReduction() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }
}