package com.ssm.springmvc.db.entity;

import java.math.BigDecimal;

public class PmsMemberPrice {
    private Long id;

    private Long productId;

    private Long memberLevelId;

    private BigDecimal memberPrice;

    private String memberLevelName;

    public PmsMemberPrice(Long id, Long productId, Long memberLevelId, BigDecimal memberPrice, String memberLevelName) {
        this.id = id;
        this.productId = productId;
        this.memberLevelId = memberLevelId;
        this.memberPrice = memberPrice;
        this.memberLevelName = memberLevelName;
    }

    public PmsMemberPrice() {
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

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName == null ? null : memberLevelName.trim();
    }
}