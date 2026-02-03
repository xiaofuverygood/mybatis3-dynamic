package com.my.service.impl;

import com.my.dynamic.entity.SysMenu;
import com.my.dynamic.mapper.SysUserDynamicSqlSupport;
import com.my.dynamic.mapper.SysUserMapper;
import com.my.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import com.my.dynamic.entity.SysUser;

import java.time.LocalDateTime;
import java.util.List;

import static com.my.dynamic.mapper.SysUserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;


/**
 * @Description TODO
 * @Author fsy
 * @Date 2022/11/14 09:09
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceimpl implements SysUserService {

    private final SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getCount() {
/*        SelectStatementProvider selectStatement = select(count(sysUser.id))
                .from(sysUser)
                .where(state, isEqualTo(0))
                .build()
                .render(RenderingStrategies.MYBATIS3);*/

        return sysUserMapper.count1();
    }

    @Override
    public boolean addSysUser() {
        SysUser sysUser = new SysUser();
        sysUser.setAccount("account4");
        sysUser.setNickName("name3");
        sysUser.setCreatedTime(LocalDateTime.now());
        sysUser.setState(0);
        sysUser.setDelFlag(0);

        // return sysUserMapper.insert(sysUser) > 0;

        InsertStatementProvider<SysUser> render = insert(sysUser)
                .into(SysUserDynamicSqlSupport.sysUser)
                .map(account).toProperty("account")
                .map(nickName).toProperty("nickName")
                .map(createdTime).toProperty("createdTime")
                .map(state).toProperty("state")
                .map(delFlag).toProperty("delFlag")
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return sysUserMapper.insert(render) > 0;
    }
}
