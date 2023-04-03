package com.spr.test.Servise;
import com.spr.test.entity.User;


public interface UserService {
    void save(User user);
    User findUserById(Integer id);
}

