package com.chj.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chj.Mapper.RoleMapper;
import com.chj.model.Role;
import com.chj.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mybatis-plus
 * @since 2020-11-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
