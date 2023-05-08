package com.xth.usercenter.service;

import com.xth.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 徐同煌
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-05-08 14:21:32
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}
