package com.ssm.springmvc.db.entity;

public class CmsHelpCategory {
    private Long id;

    private String name;

    private String icon;

    private Integer helpCount;

    private Integer showStatus;

    private Integer sort;

    public CmsHelpCategory(Long id, String name, String icon, Integer helpCount, Integer showStatus, Integer sort) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.helpCount = helpCount;
        this.showStatus = showStatus;
        this.sort = sort;
    }

    public CmsHelpCategory() {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getHelpCount() {
        return helpCount;
    }

    public void setHelpCount(Integer helpCount) {
        this.helpCount = helpCount;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}