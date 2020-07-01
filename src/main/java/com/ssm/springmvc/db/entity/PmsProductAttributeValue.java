package com.ssm.springmvc.db.entity;

public class PmsProductAttributeValue {
    private Long id;

    private Long productId;

    private Long productAttributeId;

    private String value;

    public PmsProductAttributeValue(Long id, Long productId, Long productAttributeId, String value) {
        this.id = id;
        this.productId = productId;
        this.productAttributeId = productAttributeId;
        this.value = value;
    }

    public PmsProductAttributeValue() {
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

    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}