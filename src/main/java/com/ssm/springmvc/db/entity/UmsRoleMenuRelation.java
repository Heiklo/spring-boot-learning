package com.ssm.springmvc.db.entity;

public class UmsRoleMenuRelation {
    private Long id;

    private Long roleId;

    private Long menuId;

    public UmsRoleMenuRelation(Long id, Long roleId, Long menuId) {
        this.id = id;
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public UmsRoleMenuRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}