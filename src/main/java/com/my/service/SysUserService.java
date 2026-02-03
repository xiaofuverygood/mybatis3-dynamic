package com.my.service;

import com.my.dynamic.entity.SysUser;

import java.util.List;

/**
 * @Description TODO
 * @Author fsy
 * @Date 2022/11/14 09:19
 */
public interface SysUserService {
    List<SysUser> getCount();

    boolean addSysUser();
}
