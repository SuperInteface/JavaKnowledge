package com.javaEE.fremwork.Mybatis.mapper;

import com.javaEE.fremwork.Mybatis.entity.TUserRoleKey;

public interface TUserRoleMapper {
    int deleteByPrimaryKey(TUserRoleKey key);

    int insert(TUserRoleKey record);

    int insertSelective(TUserRoleKey record);
}