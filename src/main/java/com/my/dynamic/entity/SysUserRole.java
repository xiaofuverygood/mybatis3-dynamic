package com.my.dynamic.entity;

import javax.annotation.Generated;

public class SysUserRole {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String account;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String roleName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAccount() {
        return account;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRoleName() {
        return roleName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}