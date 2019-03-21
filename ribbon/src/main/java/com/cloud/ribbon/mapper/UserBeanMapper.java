package com.cloud.ribbon.mapper;

import com.cloud.ribbon.pojo.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBeanMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);

    UserBean queryLogin(UserBean user);
}