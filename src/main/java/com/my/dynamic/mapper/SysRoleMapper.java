package com.my.dynamic.mapper;

import static com.my.dynamic.mapper.SysRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.my.dynamic.entity.SysRole;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SysRoleMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, displayName, state, describe, platformCode, createdTime, modifiedTime, delFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysRole> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysRole> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysRoleResult")
    Optional<SysRole> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="describe", property="describe", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform_code", property="platformCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="del_flag", property="delFlag", jdbcType=JdbcType.INTEGER)
    })
    List<SysRole> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysRole, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysRole, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysRole record) {
        return MyBatis3Utils.insert(this::insert, record, sysRole, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(displayName).toProperty("displayName")
            .map(state).toProperty("state")
            .map(describe).toProperty("describe")
            .map(platformCode).toProperty("platformCode")
            .map(createdTime).toProperty("createdTime")
            .map(modifiedTime).toProperty("modifiedTime")
            .map(delFlag).toProperty("delFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysRole> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysRole, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(displayName).toProperty("displayName")
            .map(state).toProperty("state")
            .map(describe).toProperty("describe")
            .map(platformCode).toProperty("platformCode")
            .map(createdTime).toProperty("createdTime")
            .map(modifiedTime).toProperty("modifiedTime")
            .map(delFlag).toProperty("delFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysRole record) {
        return MyBatis3Utils.insert(this::insert, record, sysRole, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(describe).toPropertyWhenPresent("describe", record::getDescribe)
            .map(platformCode).toPropertyWhenPresent("platformCode", record::getPlatformCode)
            .map(createdTime).toPropertyWhenPresent("createdTime", record::getCreatedTime)
            .map(modifiedTime).toPropertyWhenPresent("modifiedTime", record::getModifiedTime)
            .map(delFlag).toPropertyWhenPresent("delFlag", record::getDelFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysRole, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysRole, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysRole, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysRole> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysRole, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(state).equalTo(record::getState)
                .set(describe).equalTo(record::getDescribe)
                .set(platformCode).equalTo(record::getPlatformCode)
                .set(createdTime).equalTo(record::getCreatedTime)
                .set(modifiedTime).equalTo(record::getModifiedTime)
                .set(delFlag).equalTo(record::getDelFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(state).equalToWhenPresent(record::getState)
                .set(describe).equalToWhenPresent(record::getDescribe)
                .set(platformCode).equalToWhenPresent(record::getPlatformCode)
                .set(createdTime).equalToWhenPresent(record::getCreatedTime)
                .set(modifiedTime).equalToWhenPresent(record::getModifiedTime)
                .set(delFlag).equalToWhenPresent(record::getDelFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysRole record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(displayName).equalTo(record::getDisplayName)
            .set(state).equalTo(record::getState)
            .set(describe).equalTo(record::getDescribe)
            .set(platformCode).equalTo(record::getPlatformCode)
            .set(createdTime).equalTo(record::getCreatedTime)
            .set(modifiedTime).equalTo(record::getModifiedTime)
            .set(delFlag).equalTo(record::getDelFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysRole record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(displayName).equalToWhenPresent(record::getDisplayName)
            .set(state).equalToWhenPresent(record::getState)
            .set(describe).equalToWhenPresent(record::getDescribe)
            .set(platformCode).equalToWhenPresent(record::getPlatformCode)
            .set(createdTime).equalToWhenPresent(record::getCreatedTime)
            .set(modifiedTime).equalToWhenPresent(record::getModifiedTime)
            .set(delFlag).equalToWhenPresent(record::getDelFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}