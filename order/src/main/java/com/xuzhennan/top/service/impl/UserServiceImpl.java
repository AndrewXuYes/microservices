package com.xuzhennan.top.service.impl;

import com.xuzhennan.top.mapper.UserMapper;
import com.xuzhennan.top.model.User;
import com.xuzhennan.top.model.UserExample;
import com.xuzhennan.top.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public int creatUser(User umsAdminParam) {
        User user = new User();
        BeanUtils.copyProperties(umsAdminParam, user);
        user.setStatus(1);
        //查询是否有相同用户名的用户
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> userList = userMapper.selectByExample(example);

        return userList.size() > 0 ? 0 : userMapper.insert(user);
    }

    @Override
    public int deletcUser(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int changeUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User findUser(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
