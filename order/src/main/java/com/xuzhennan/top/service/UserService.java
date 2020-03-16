package com.xuzhennan.top.service;


import com.xuzhennan.top.model.User;

import java.util.List;

public interface UserService {

    User creatUser(User user);

    User deletcUser(User user);

    User changeUser(User user);

    User findUser(User user);

    List<User> findAllUser();
}
