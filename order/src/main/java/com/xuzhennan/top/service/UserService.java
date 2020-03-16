package com.xuzhennan.top.service;


import com.xuzhennan.top.model.User;

import java.util.List;

public interface UserService {

    int creatUser(User user);

    int deletcUser(int user);

    int changeUser(User user);

    User findUser(User user);

    List<User> findAllUser();
}
