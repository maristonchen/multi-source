package com.shenzhenair.source.service.impl;

import com.shenzhenair.source.bean.master.User;
import com.shenzhenair.source.mapper.master.UserMapper;
import com.shenzhenair.source.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * (用一句话描述该文件做什么)
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/7
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    @Transactional(transactionManager = "transactionManagerMaster")
    public void save(User user) {

        userMapper.insert(user);

    }

    @Override
    public User queryById(String id) {
        return userMapper.selectOneById(id);
    }
}
