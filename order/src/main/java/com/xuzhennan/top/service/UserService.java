package com.xuzhennan.top.service;


import com.xuzhennan.top.model.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {

    @Transactional
    int creatUser(User user);

    int deletcUser(Long user);

    int changeUser(User user);

    User findUser(Long id);

}
