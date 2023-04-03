package com.spr.test.Controller;

import com.spr.test.entity.Tanponin;
import com.spr.test.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    void createUser() {
        User user = new PodamFactoryImpl().manufacturePojo(User.class);
        ResponseEntity <?> response = userController.createUser(user);
        System.out.println(response);
    }

    @Test
    void findUser() {
        ResponseEntity <?> response = userController.findUser(3);
        System.out.println(response);
        ResponseEntity <?> response1 = userController.findUser(0);
        System.out.println(response1);
    }
}