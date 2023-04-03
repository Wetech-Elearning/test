package com.spr.test.mapper;

import com.spr.test.entity.Shienshinse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShienshinseMapperTest {
    @Autowired
    private ShienshinseMapper shienshinseMapper;

    @Test
    void testInsert() {
        Shienshinse shienshinse = new Shienshinse();
        shienshinse.setHisaijutakuShurui("0001");
        shienshinse.setKariireIninKaishaName("1111");
        Integer id = shienshinseMapper.insert(shienshinse);
        System.out.println(id);

    }
}
