package com.ssm.springmvc.db.entity;

import java.math.BigDecimal;

public class PmsProductLadder {
    private Long id;

    private Long productId;

    private Integer count;

    private BigDecimal discount;

    private BigDecimal price;

    public PmsProductLadder(Long id, Long productId, Integer count, BigDecimal discount, BigDecimal price) {
        this.id = id;
        this.productId = productId;
        this.count = count;
        this.discount = discount;
        this.price = price;
    }

    public PmsProductLadder() {
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}