package com.my.dynamic.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysRoleDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SysRole sysRole = new SysRole();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = sysRole.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = sysRole.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> displayName = sysRole.displayName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> state = sysRole.state;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> describe = sysRole.describe;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> platformCode = sysRole.platformCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> createdTime = sysRole.createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> modifiedTime = sysRole.modifiedTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> delFlag = sysRole.delFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SysRole extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> state = column("state", JDBCType.INTEGER);

        public final SqlColumn<String> describe = column("describe", JDBCType.VARCHAR);

        public final SqlColumn<String> platformCode = column("platform_code", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> createdTime = column("created_time", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> modifiedTime = column("modified_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> delFlag = column("del_flag", JDBCType.INTEGER);

        public SysRole() {
            super("sys_role");
        }
    }
}