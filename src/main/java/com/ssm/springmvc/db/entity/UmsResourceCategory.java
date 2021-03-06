package com.ssm.springmvc.db.entity;

import java.util.Date;

public class UmsResourceCategory {
    private Long id;

    private Date createTime;

    private String name;

    private Integer sort;

    public UmsResourceCategory(Long id, Date createTime, String name, Integer sort) {
        this.id = id;
        this.createTime = createTime;
        this.name = name;
        this.sort = sort;
    }

    public UmsResourceCategory() {
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}