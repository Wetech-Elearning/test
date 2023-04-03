package com.spr.test.mapper;

import com.spr.test.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        User user = new User();

        Integer id = userMapper.insert(user);
        System.out.println(id);

    }

    @Test
    void testFindById() {
        User user = userMapper.findById(3);
        System.out.println(user);

    }
}
