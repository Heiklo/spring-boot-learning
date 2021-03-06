package com.ssm.springmvc.db.entity;

import java.util.Date;

public class UmsResource {
    private Long id;

    private Date createTime;

    private String name;

    private String url;

    private String description;

    private Long categoryId;

    public UmsResource(Long id, Date createTime, String name, String url, String description, Long categoryId) {
        this.id = id;
        this.createTime = createTime;
        this.name = name;
        this.url = url;
        this.description = description;
        this.categoryId = categoryId;
    }

    public UmsResource() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}