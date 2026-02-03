package com.my.controller;

import com.my.dynamic.entity.SysUser;
import com.my.dynamic.mapper.SysUserDynamicSqlSupport;
import com.my.service.SysUserService;
import com.my.service.impl.SysUserServiceimpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description TODO
 * @Author fsy
 * @Date 2022/11/13 21:30
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("123")
public class SysUserController {

    private final SysUserService sysUserService;

    @GetMapping("/getCount")
    public List<SysUser> getCount() {

        return sysUserService.getCount();
    }

    @PostMapping("/addSysUser")
    public boolean addSysUser() {

        return sysUserService.addSysUser();
    }
}
