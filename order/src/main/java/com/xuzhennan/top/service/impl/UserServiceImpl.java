package com.xuzhennan.top.service.impl;

import com.xuzhennan.top.mapper.UserMapper;
import com.xuzhennan.top.model.User;
import com.xuzhennan.top.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User creatUser(User user) {
        return null;
    }

    @Override
    public User deletcUser(User user) {
        return null;
    }

    @Override
    public User changeUser(User user) {
        return null;
    }

    @Override
    public User findUser(User user) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }
}
