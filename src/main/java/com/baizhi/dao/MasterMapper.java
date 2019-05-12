package com.baizhi.dao;

import com.baizhi.entity.Master;

public interface MasterMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Master record);

    int insertSelective(Master record);

    Master selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Master record);

    int updateByPrimaryKey(Master record);
}