package com.ssm.springmvc.db.entity;

public class UmsAdminRoleRelation {
    private Long id;

    private Long adminId;

    private Long roleId;

    public UmsAdminRoleRelation(Long id, Long adminId, Long roleId) {
        this.id = id;
        this.adminId = adminId;
        this.roleId = roleId;
    }

    public UmsAdminRoleRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}