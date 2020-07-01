package com.ssm.springmvc.db.entity;

import java.util.Date;

public class CmsMemberReport {
    private Long id;

    private Integer reportType;

    private String reportMemberName;

    private Date createTime;

    private String reportObject;

    private Integer reportStatus;

    private Integer handleStatus;

    private String note;

    public CmsMemberReport(Long id, Integer reportType, String reportMemberName, Date createTime, String reportObject, Integer reportStatus, Integer handleStatus, String note) {
        this.id = id;
        this.reportType = reportType;
        this.reportMemberName = reportMemberName;
        this.createTime = createTime;
        this.reportObject = reportObject;
        this.reportStatus = reportStatus;
        this.handleStatus = handleStatus;
        this.note = note;
    }

    public CmsMemberReport() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public String getReportMemberName() {
        return reportMemberName;
    }

    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName == null ? null : reportMemberName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReportObject() {
        return reportObject;
    }

    public void setReportObject(String reportObject) {
        this.reportObject = reportObject == null ? null : reportObject.trim();
    }

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}