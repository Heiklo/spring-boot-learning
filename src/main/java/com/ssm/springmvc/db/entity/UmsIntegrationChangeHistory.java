package com.ssm.springmvc.db.entity;

import java.util.Date;

public class UmsIntegrationChangeHistory {
    private Long id;

    private Long memberId;

    private Date createTime;

    private Integer changeType;

    private Integer changeCount;

    private String operateMan;

    private String operateNote;

    private Integer sourceType;

    public UmsIntegrationChangeHistory(Long id, Long memberId, Date createTime, Integer changeType, Integer changeCount, String operateMan, String operateNote, Integer sourceType) {
        this.id = id;
        this.memberId = memberId;
        this.createTime = createTime;
        this.changeType = changeType;
        this.changeCount = changeCount;
        this.operateMan = operateMan;
        this.operateNote = operateNote;
        this.sourceType = sourceType;
    }

    public UmsIntegrationChangeHistory() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    public String getOperateNote() {
        return operateNote;
    }

    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote == null ? null : operateNote.trim();
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }
}