package com.my.dynamic.mapper;

import static com.my.dynamic.mapper.SysMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.my.dynamic.entity.SysMenu;
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
public interface SysMenuMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, displayName, url, menuIndex, state, pid, icon, display, platformCode, delFlag, createdTime, modifiedTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysMenu> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysMenu> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysMenuResult")
    Optional<SysMenu> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysMenuResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="menu_index", property="menuIndex", jdbcType=JdbcType.INTEGER),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="display", property="display", jdbcType=JdbcType.TINYINT),
        @Result(column="platform_code", property="platformCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="del_flag", property="delFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysMenu> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysMenu record) {
        return MyBatis3Utils.insert(this::insert, record, sysMenu, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(displayName).toProperty("displayName")
            .map(url).toProperty("url")
            .map(menuIndex).toProperty("menuIndex")
            .map(state).toProperty("state")
            .map(pid).toProperty("pid")
            .map(icon).toProperty("icon")
            .map(display).toProperty("display")
            .map(platformCode).toProperty("platformCode")
            .map(delFlag).toProperty("delFlag")
            .map(createdTime).toProperty("createdTime")
            .map(modifiedTime).toProperty("modifiedTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysMenu> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysMenu, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(displayName).toProperty("displayName")
            .map(url).toProperty("url")
            .map(menuIndex).toProperty("menuIndex")
            .map(state).toProperty("state")
            .map(pid).toProperty("pid")
            .map(icon).toProperty("icon")
            .map(display).toProperty("display")
            .map(platformCode).toProperty("platformCode")
            .map(delFlag).toProperty("delFlag")
            .map(createdTime).toProperty("createdTime")
            .map(modifiedTime).toProperty("modifiedTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysMenu record) {
        return MyBatis3Utils.insert(this::insert, record, sysMenu, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(menuIndex).toPropertyWhenPresent("menuIndex", record::getMenuIndex)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(pid).toPropertyWhenPresent("pid", record::getPid)
            .map(icon).toPropertyWhenPresent("icon", record::getIcon)
            .map(display).toPropertyWhenPresent("display", record::getDisplay)
            .map(platformCode).toPropertyWhenPresent("platformCode", record::getPlatformCode)
            .map(delFlag).toPropertyWhenPresent("delFlag", record::getDelFlag)
            .map(createdTime).toPropertyWhenPresent("createdTime", record::getCreatedTime)
            .map(modifiedTime).toPropertyWhenPresent("modifiedTime", record::getModifiedTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysMenu> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysMenu> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysMenu> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysMenu> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(url).equalTo(record::getUrl)
                .set(menuIndex).equalTo(record::getMenuIndex)
                .set(state).equalTo(record::getState)
                .set(pid).equalTo(record::getPid)
                .set(icon).equalTo(record::getIcon)
                .set(display).equalTo(record::getDisplay)
                .set(platformCode).equalTo(record::getPlatformCode)
                .set(delFlag).equalTo(record::getDelFlag)
                .set(createdTime).equalTo(record::getCreatedTime)
                .set(modifiedTime).equalTo(record::getModifiedTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(menuIndex).equalToWhenPresent(record::getMenuIndex)
                .set(state).equalToWhenPresent(record::getState)
                .set(pid).equalToWhenPresent(record::getPid)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(display).equalToWhenPresent(record::getDisplay)
                .set(platformCode).equalToWhenPresent(record::getPlatformCode)
                .set(delFlag).equalToWhenPresent(record::getDelFlag)
                .set(createdTime).equalToWhenPresent(record::getCreatedTime)
                .set(modifiedTime).equalToWhenPresent(record::getModifiedTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysMenu record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(displayName).equalTo(record::getDisplayName)
            .set(url).equalTo(record::getUrl)
            .set(menuIndex).equalTo(record::getMenuIndex)
            .set(state).equalTo(record::getState)
            .set(pid).equalTo(record::getPid)
            .set(icon).equalTo(record::getIcon)
            .set(display).equalTo(record::getDisplay)
            .set(platformCode).equalTo(record::getPlatformCode)
            .set(delFlag).equalTo(record::getDelFlag)
            .set(createdTime).equalTo(record::getCreatedTime)
            .set(modifiedTime).equalTo(record::getModifiedTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysMenu record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(displayName).equalToWhenPresent(record::getDisplayName)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(menuIndex).equalToWhenPresent(record::getMenuIndex)
            .set(state).equalToWhenPresent(record::getState)
            .set(pid).equalToWhenPresent(record::getPid)
            .set(icon).equalToWhenPresent(record::getIcon)
            .set(display).equalToWhenPresent(record::getDisplay)
            .set(platformCode).equalToWhenPresent(record::getPlatformCode)
            .set(delFlag).equalToWhenPresent(record::getDelFlag)
            .set(createdTime).equalToWhenPresent(record::getCreatedTime)
            .set(modifiedTime).equalToWhenPresent(record::getModifiedTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}