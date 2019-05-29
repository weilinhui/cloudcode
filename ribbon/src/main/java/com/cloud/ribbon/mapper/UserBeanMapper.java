package com.cloud.ribbon.mapper;

import com.cloud.ribbon.pojo.UserBean;

public interface UserBeanMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);

	UserBean queryLogin(UserBean record);
}