package com.javaEE.fremwork.Mybatis.mapper;

import com.javaEE.fremwork.Mybatis.entity.TTest20201122;
import java.util.List;

public interface TTest20201122Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TTest20201122 record);

    TTest20201122 selectByPrimaryKey(Integer id);

    List<TTest20201122> selectAll();

    int updateByPrimaryKey(TTest20201122 record);
}