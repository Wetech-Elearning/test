package com.spr.test.Servise.Impl;

import com.spr.test.Servise.UserService;
import com.spr.test.entity.User;
import com.spr.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
    @Override
    public User findUserById(Integer id) {
        return userMapper.findById(id);
    }

}

