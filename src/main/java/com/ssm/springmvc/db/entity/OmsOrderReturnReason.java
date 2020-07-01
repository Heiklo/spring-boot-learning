package com.ssm.springmvc.db.entity;

import java.util.Date;

public class OmsOrderReturnReason {
    private Long id;

    private String name;

    private Integer sort;

    private Integer status;

    private Date createTime;

    public OmsOrderReturnReason(Long id, String name, Integer sort, Integer status, Date createTime) {
        this.id = id;
        this.name = name;
        this.sort = sort;
        this.status = status;
        this.createTime = createTime;
    }

    public OmsOrderReturnReason() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}