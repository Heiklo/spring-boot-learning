package com.ssm.springmvc.db.entity;

public class PmsProductCategoryAttributeRelation {
    private Long id;

    private Long productCategoryId;

    private Long productAttributeId;

    public PmsProductCategoryAttributeRelation(Long id, Long productCategoryId, Long productAttributeId) {
        this.id = id;
        this.productCategoryId = productCategoryId;
        this.productAttributeId = productAttributeId;
    }

    public PmsProductCategoryAttributeRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }
}