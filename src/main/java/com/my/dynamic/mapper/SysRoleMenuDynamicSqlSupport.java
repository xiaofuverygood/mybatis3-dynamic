package com.my.dynamic.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysRoleMenuDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SysRoleMenu sysRoleMenu = new SysRoleMenu();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = sysRoleMenu.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> roleName = sysRoleMenu.roleName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuName = sysRoleMenu.menuName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SysRoleMenu extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> roleName = column("role_name", JDBCType.VARCHAR);

        public final SqlColumn<String> menuName = column("menu_name", JDBCType.VARCHAR);

        public SysRoleMenu() {
            super("sys_role_menu");
        }
    }
}