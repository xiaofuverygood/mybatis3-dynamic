package com.my.dynamic.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysUserRoleDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SysUserRole sysUserRole = new SysUserRole();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = sysUserRole.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> account = sysUserRole.account;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> roleName = sysUserRole.roleName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SysUserRole extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> account = column("account", JDBCType.VARCHAR);

        public final SqlColumn<String> roleName = column("role_name", JDBCType.VARCHAR);

        public SysUserRole() {
            super("sys_user_role");
        }
    }
}