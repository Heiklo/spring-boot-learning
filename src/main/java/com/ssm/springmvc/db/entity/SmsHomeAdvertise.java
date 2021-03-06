package com.ssm.springmvc.db.entity;

import java.util.Date;

public class SmsHomeAdvertise {
    private Long id;

    private String name;

    private Integer type;

    private String pic;

    private Date startTime;

    private Date endTime;

    private Integer status;

    private Integer clickCount;

    private Integer orderCount;

    private String url;

    private String note;

    private Integer sort;

    public SmsHomeAdvertise(Long id, String name, Integer type, String pic, Date startTime, Date endTime, Integer status, Integer clickCount, Integer orderCount, String url, String note, Integer sort) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.pic = pic;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.clickCount = clickCount;
        this.orderCount = orderCount;
        this.url = url;
        this.note = note;
        this.sort = sort;
    }

    public SmsHomeAdvertise() {
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}