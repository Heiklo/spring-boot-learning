package com.ssm.springmvc.db.entity;

public class UmsMemberTask {
    private Long id;

    private String name;

    private Integer growth;

    private Integer intergration;

    private Integer type;

    public UmsMemberTask(Long id, String name, Integer growth, Integer intergration, Integer type) {
        this.id = id;
        this.name = name;
        this.growth = growth;
        this.intergration = intergration;
        this.type = type;
    }

    public UmsMemberTask() {
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

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getIntergration() {
        return intergration;
    }

    public void setIntergration(Integer intergration) {
        this.intergration = intergration;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}