package com.ssm.springmvc.db.entity;

import java.util.Date;

public class CmsTopic {
    private Long id;

    private Long categoryId;

    private String name;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    private Integer attendCount;

    private Integer attentionCount;

    private Integer readCount;

    private String awardName;

    private String attendType;

    private String content;

    public CmsTopic(Long id, Long categoryId, String name, Date createTime, Date startTime, Date endTime, Integer attendCount, Integer attentionCount, Integer readCount, String awardName, String attendType) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.createTime = createTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.attendCount = attendCount;
        this.attentionCount = attentionCount;
        this.readCount = readCount;
        this.awardName = awardName;
        this.attendType = attendType;
    }

    public CmsTopic(Long id, Long categoryId, String name, Date createTime, Date startTime, Date endTime, Integer attendCount, Integer attentionCount, Integer readCount, String awardName, String attendType, String content) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.createTime = createTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.attendCount = attendCount;
        this.attentionCount = attentionCount;
        this.readCount = readCount;
        this.awardName = awardName;
        this.attendType = attendType;
        this.content = content;
    }

    public CmsTopic() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public Integer getAttentionCount() {
        return attentionCount;
    }

    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    public String getAttendType() {
        return attendType;
    }

    public void setAttendType(String attendType) {
        this.attendType = attendType == null ? null : attendType.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}