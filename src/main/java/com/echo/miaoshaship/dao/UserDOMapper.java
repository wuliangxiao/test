package com.echo.miaoshaship.dao;

import com.echo.miaoshaship.dataobject.UserDO;

public interface UserDOMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(UserDO record);


    int insertSelective(UserDO record);


    UserDO selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(UserDO record);


    int updateByPrimaryKey(UserDO record);

    UserDO selectByTelphone(String telphone);
}