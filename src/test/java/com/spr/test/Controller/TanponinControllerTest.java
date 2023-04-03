package com.spr.test.Controller;

import com.spr.test.entity.Tanponin;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.jemos.podam.api.PodamFactoryImpl;
@SpringBootTest

class TanponinControllerTest {
    @Autowired
    private TanponinController tanponinController;
    @Test
    void createTanponin() {
        Tanponin tanponin = new PodamFactoryImpl().manufacturePojo(Tanponin.class);

        ResponseEntity<?> response = tanponinController.createTanponin(tanponin);
        System.out.println(response);

    }

    @Test
    void findTanponin() {
        ResponseEntity <?> response = tanponinController.findTanponin(3);
        System.out.println(response);
        ResponseEntity <?> response1 = tanponinController.findTanponin(0);
        System.out.println(response1);
    }

}