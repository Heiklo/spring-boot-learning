package com.ssm.springmvc.db.entity;

public class CmsPrefrenceAreaProductRelation {
    private Long id;

    private Long prefrenceAreaId;

    private Long productId;

    public CmsPrefrenceAreaProductRelation(Long id, Long prefrenceAreaId, Long productId) {
        this.id = id;
        this.prefrenceAreaId = prefrenceAreaId;
        this.productId = productId;
    }

    public CmsPrefrenceAreaProductRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}