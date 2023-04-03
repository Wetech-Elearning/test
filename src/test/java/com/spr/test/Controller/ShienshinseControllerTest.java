package com.spr.test.Controller;

import com.spr.test.entity.Shienshinse;
import com.spr.test.entity.Tanponin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShienshinseControllerTest {
    @Autowired
    private ShienshinseController shienshinseController;

    @Test
    void saveShienshinse() {
        Shienshinse shienshinse = new PodamFactoryImpl().manufacturePojo(Shienshinse.class);

        ResponseEntity<?> response = shienshinseController.saveShienshinse(shienshinse);
        System.out.println(response);
    }

    @Test
    void findShienshinse() {
        ResponseEntity<?> response = this.shienshinseController.findShienshinse(23);
        System.out.println(response);
        ResponseEntity<?> response1 = this.shienshinseController.findShienshinse(0);
        System.out.println(response1);
    }
}