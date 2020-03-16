package com.xuzhennan.top.service;


import com.xuzhennan.top.model.User;

import java.util.List;

public interface UserService {

    User creatUser();

    User deletcUser();

    User changeUser();

    User findUser();

    List<User> findAllUser();
}
