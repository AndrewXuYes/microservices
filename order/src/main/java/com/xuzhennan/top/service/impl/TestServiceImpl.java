package com.xuzhennan.top.service.impl;

import com.xuzhennan.top.mapper.UserMapper;
import com.xuzhennan.top.model.User;
import com.xuzhennan.top.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品优选Service实现类
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private UserMapper testMapper;

    @Override
    public User listAll() {
        System.out.println("listAll 进入");
        return testMapper.selectByPrimaryKey(1);
    }
}
