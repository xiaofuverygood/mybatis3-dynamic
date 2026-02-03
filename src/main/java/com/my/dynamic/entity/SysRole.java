package com.my.dynamic.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class SysRole {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String displayName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer state;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String describe;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String platformCode;

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
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDisplayName() {
        return displayName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
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
    public String getDescribe() {
        return describe;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlatformCode() {
        return platformCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode == null ? null : platformCode.trim();
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