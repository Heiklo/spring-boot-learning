package com.ssm.springmvc.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PmsProductWithBLOBs extends PmsProduct {
    private String description;

    private String detailDesc;

    private String detailHtml;

    private String detailMobileHtml;

    public PmsProductWithBLOBs(Long id, Long brandId, Long productCategoryId, Long feightTemplateId, Long productAttributeCategoryId, String name, String pic, String productSn, Integer deleteStatus, Integer publishStatus, Integer newStatus, Integer recommandStatus, Integer verifyStatus, Integer sort, Integer sale, BigDecimal price, BigDecimal promotionPrice, Integer giftGrowth, Integer giftPoint, Integer usePointLimit, String subTitle, BigDecimal originalPrice, Integer stock, Integer lowStock, String unit, BigDecimal weight, Integer previewStatus, String serviceIds, String keywords, String note, String albumPics, String detailTitle, Date promotionStartTime, Date promotionEndTime, Integer promotionPerLimit, Integer promotionType, String brandName, String productCategoryName, String description, String detailDesc, String detailHtml, String detailMobileHtml) {
        super(id, brandId, productCategoryId, feightTemplateId, productAttributeCategoryId, name, pic, productSn, deleteStatus, publishStatus, newStatus, recommandStatus, verifyStatus, sort, sale, price, promotionPrice, giftGrowth, giftPoint, usePointLimit, subTitle, originalPrice, stock, lowStock, unit, weight, previewStatus, serviceIds, keywords, note, albumPics, detailTitle, promotionStartTime, promotionEndTime, promotionPerLimit, promotionType, brandName, productCategoryName);
        this.description = description;
        this.detailDesc = detailDesc;
        this.detailHtml = detailHtml;
        this.detailMobileHtml = detailMobileHtml;
    }

    public PmsProductWithBLOBs() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc == null ? null : detailDesc.trim();
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml == null ? null : detailHtml.trim();
    }

    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml == null ? null : detailMobileHtml.trim();
    }
}