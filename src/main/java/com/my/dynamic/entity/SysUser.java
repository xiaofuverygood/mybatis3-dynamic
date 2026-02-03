package com.my.dynamic.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class SysUser {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String account;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String describe;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String nickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String email;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer state;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String avatarUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime modifiedTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer delFlag;

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
    public String getDescribe() {
        return describe;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNickName() {
        return nickName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPhone() {
        return phone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmail() {
        return email;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getState() {
        return state;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setState(Integer state) {
        this.state = state;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getDelFlag() {
        return delFlag;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}