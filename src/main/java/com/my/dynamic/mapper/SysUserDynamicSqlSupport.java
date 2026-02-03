package com.my.dynamic.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysUserDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SysUser sysUser = new SysUser();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = sysUser.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> account = sysUser.account;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> describe = sysUser.describe;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nickName = sysUser.nickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> phone = sysUser.phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> email = sysUser.email;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> state = sysUser.state;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> avatarUrl = sysUser.avatarUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> createdTime = sysUser.createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> modifiedTime = sysUser.modifiedTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> delFlag = sysUser.delFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SysUser extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> account = column("account", JDBCType.VARCHAR);

        public final SqlColumn<String> describe = column("describe", JDBCType.VARCHAR);

        public final SqlColumn<String> nickName = column("nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<Integer> state = column("state", JDBCType.INTEGER);

        public final SqlColumn<String> avatarUrl = column("avatar_url", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> createdTime = column("created_time", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> modifiedTime = column("modified_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> delFlag = column("del_flag", JDBCType.INTEGER);

        public SysUser() {
            super("sys_user");
        }
    }
}