package com.ssm.springmvc.db.entity;

public class UmsMemberProductCategoryRelation {
    private Long id;

    private Long memberId;

    private Long productCategoryId;

    public UmsMemberProductCategoryRelation(Long id, Long memberId, Long productCategoryId) {
        this.id = id;
        this.memberId = memberId;
        this.productCategoryId = productCategoryId;
    }

    public UmsMemberProductCategoryRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
}