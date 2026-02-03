package com.my.dynamic.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysMenuDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SysMenu sysMenu = new SysMenu();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = sysMenu.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = sysMenu.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> displayName = sysMenu.displayName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> url = sysMenu.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> menuIndex = sysMenu.menuIndex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> state = sysMenu.state;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> pid = sysMenu.pid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> icon = sysMenu.icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Byte> display = sysMenu.display;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> platformCode = sysMenu.platformCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> delFlag = sysMenu.delFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> createdTime = sysMenu.createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> modifiedTime = sysMenu.modifiedTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SysMenu extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<Integer> menuIndex = column("menu_index", JDBCType.INTEGER);

        public final SqlColumn<Integer> state = column("state", JDBCType.INTEGER);

        public final SqlColumn<Integer> pid = column("pid", JDBCType.INTEGER);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Byte> display = column("display", JDBCType.TINYINT);

        public final SqlColumn<String> platformCode = column("platform_code", JDBCType.VARCHAR);

        public final SqlColumn<Integer> delFlag = column("del_flag", JDBCType.INTEGER);

        public final SqlColumn<LocalDateTime> createdTime = column("created_time", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> modifiedTime = column("modified_time", JDBCType.TIMESTAMP);

        public SysMenu() {
            super("sys_menu");
        }
    }
}