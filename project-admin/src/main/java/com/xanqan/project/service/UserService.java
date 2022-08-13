package com.xanqan.project.service;

import com.xanqan.project.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 28961
* @description 针对表【user】的数据库操作Service
* @createDate 2022-08-13 14:19:26
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userName 用户账户
     * @param password 用户密码
     * @return 新用户 id
     */
    int userRegister(String userName, String password);


    /**
     * 用户注册
     *
     * @param userName 用户账户
     * @param password 用户密码
     * @return 新用户 id
     */
    String userLogin(String userName, String password);
}
