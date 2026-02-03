package com.my.dynamic.mapper;

import com.my.dynamic.entity.SysUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import javax.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.my.dynamic.mapper.SysMenuDynamicSqlSupport.pid;
import static com.my.dynamic.mapper.SysMenuDynamicSqlSupport.sysMenu;
import static com.my.dynamic.mapper.SysUserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;


@Mapper
public interface SysUserMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, account, nickName, phone, email, state, avatarUrl, createdTime, modifiedTime, delFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysUser> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysUser> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysUserResult")
    Optional<SysUser> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysUserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="describe", property="describe", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="avatar_url", property="avatarUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="del_flag", property="delFlag", jdbcType=JdbcType.INTEGER)
    })
    List<SysUser> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysUser record) {
        return MyBatis3Utils.insert(this::insert, record, sysUser, c -> c
           // c.map(id).toProperty("id")
            .map(account).toProperty("account")
            //.map(describe).toProperty("describe")
            .map(nickName).toProperty("nickName")
            //.map(phone).toProperty("phone")
            //.map(email).toProperty("email")
                .map(createdTime).toProperty("createdTime")
            .map(state).toProperty("state")
            //.map(avatarUrl).toProperty("avatarUrl")

            //.map(modifiedTime).toProperty("modifiedTime")
            .map(delFlag).toProperty("delFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysUser> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysUser, c ->
            c.map(id).toProperty("id")
            .map(account).toProperty("account")
            .map(describe).toProperty("describe")
            .map(nickName).toProperty("nickName")
            .map(phone).toProperty("phone")
            .map(email).toProperty("email")
            .map(state).toProperty("state")
            .map(avatarUrl).toProperty("avatarUrl")
            .map(createdTime).toProperty("createdTime")
            .map(modifiedTime).toProperty("modifiedTime")
            .map(delFlag).toProperty("delFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysUser record) {
        return MyBatis3Utils.insert(this::insert, record, sysUser, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(account).toPropertyWhenPresent("account", record::getAccount)
            .map(describe).toPropertyWhenPresent("describe", record::getDescribe)
            .map(nickName).toPropertyWhenPresent("nickName", record::getNickName)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(avatarUrl).toPropertyWhenPresent("avatarUrl", record::getAvatarUrl)
            .map(createdTime).toPropertyWhenPresent("createdTime", record::getCreatedTime)
            .map(modifiedTime).toPropertyWhenPresent("modifiedTime", record::getModifiedTime)
            .map(delFlag).toPropertyWhenPresent("delFlag", record::getDelFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysUser> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysUser> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysUser> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysUser> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysUser record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(account).equalTo(record::getAccount)
                .set(describe).equalTo(record::getDescribe)
                .set(nickName).equalTo(record::getNickName)
                .set(phone).equalTo(record::getPhone)
                .set(email).equalTo(record::getEmail)
                .set(state).equalTo(record::getState)
                .set(avatarUrl).equalTo(record::getAvatarUrl)
                .set(createdTime).equalTo(record::getCreatedTime)
                .set(modifiedTime).equalTo(record::getModifiedTime)
                .set(delFlag).equalTo(record::getDelFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysUser record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(account).equalToWhenPresent(record::getAccount)
                .set(describe).equalToWhenPresent(record::getDescribe)
                .set(nickName).equalToWhenPresent(record::getNickName)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(state).equalToWhenPresent(record::getState)
                .set(avatarUrl).equalToWhenPresent(record::getAvatarUrl)
                .set(createdTime).equalToWhenPresent(record::getCreatedTime)
                .set(modifiedTime).equalToWhenPresent(record::getModifiedTime)
                .set(delFlag).equalToWhenPresent(record::getDelFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysUser record) {
        return update(c ->
            c.set(account).equalTo(record::getAccount)
            .set(describe).equalTo(record::getDescribe)
            .set(nickName).equalTo(record::getNickName)
            .set(phone).equalTo(record::getPhone)
            .set(email).equalTo(record::getEmail)
            .set(state).equalTo(record::getState)
            .set(avatarUrl).equalTo(record::getAvatarUrl)
            .set(createdTime).equalTo(record::getCreatedTime)
            .set(modifiedTime).equalTo(record::getModifiedTime)
            .set(delFlag).equalTo(record::getDelFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysUser record) {
        return update(c ->
            c.set(account).equalToWhenPresent(record::getAccount)
            .set(describe).equalToWhenPresent(record::getDescribe)
            .set(nickName).equalToWhenPresent(record::getNickName)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(email).equalToWhenPresent(record::getEmail)
            .set(state).equalToWhenPresent(record::getState)
            .set(avatarUrl).equalToWhenPresent(record::getAvatarUrl)
            .set(createdTime).equalToWhenPresent(record::getCreatedTime)
            .set(modifiedTime).equalToWhenPresent(record::getModifiedTime)
            .set(delFlag).equalToWhenPresent(record::getDelFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    default List<SysUser> count1() {
       /* SelectStatementProvider selectStatement =
                SqlBuilder.select(selectList)
                        .from(sysUser)
                        .where(state, isEqualTo(0))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);

        return selectMany(selectStatement);*/

        // select(c -> c.where(state, isEqualTo(0)));

        return select(c -> c
                .leftJoin(sysMenu)
                .on(id, equalTo(sysMenu.state))
                .where(state, isEqualTo(0)));
    }
}