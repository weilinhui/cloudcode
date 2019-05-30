package com.cloud.ribbon.servcie;

import com.cloud.ribbon.pojo.UserBean;

/**
 * Created by weilinhui on 2019/5/30.
 */
public interface UserserviceProvide {

	UserBean queryUserById(UserBean userBean);

	UserBean queryLogin(UserBean userBean);
}
