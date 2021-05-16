package com.javaEE.fremwork.Mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.javaEE.fremwork.Mybatis.entity.TJobHistory;
import com.javaEE.fremwork.Mybatis.entity.TUser;

public interface TJobHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TJobHistory record);

    int insertSelective(TJobHistory record);

    TJobHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TJobHistory record);

    int updateByPrimaryKey(TJobHistory record);
    
    List<TJobHistory> selectByUserId(int userId);
    
    List<TUser> selectByEmailAndSex2(@Param("email")String email,@Param("sex")Byte sex);
}