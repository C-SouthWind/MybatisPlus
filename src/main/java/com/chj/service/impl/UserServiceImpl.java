package com.chj.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chj.Mapper.UserMapper;
import com.chj.model.User;
import com.chj.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chj
 * @since 2020-11-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
