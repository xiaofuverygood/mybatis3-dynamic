package com.my.dynamic.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;

public class SysMenu {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String displayName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer menuIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer state;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer pid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Byte display;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String platformCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer delFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime modifiedTime;

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
    public String getUrl() {
        return url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMenuIndex() {
        return menuIndex;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuIndex(Integer menuIndex) {
        this.menuIndex = menuIndex;
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
    public Integer getPid() {
        return pid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIcon() {
        return icon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Byte getDisplay() {
        return display;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDisplay(Byte display) {
        this.display = display;
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
    public Integer getDelFlag() {
        return delFlag;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
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
}