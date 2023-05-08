package com.xth.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xth.usercenter.mapper.UserMapper;
import com.xth.usercenter.model.domain.User;
import com.xth.usercenter.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 徐同煌
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-05-08 14:21:32
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




