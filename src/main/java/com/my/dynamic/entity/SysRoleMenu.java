package com.my.dynamic.entity;

import javax.annotation.Generated;

public class SysRoleMenu {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String roleName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String menuName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRoleName() {
        return roleName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMenuName() {
        return menuName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }
}