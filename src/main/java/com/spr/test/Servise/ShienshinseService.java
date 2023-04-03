package com.spr.test.Servise;

import com.spr.test.entity.Shienshinse;
import com.spr.test.entity.User;

public interface ShienshinseService {
    void save(Shienshinse shienshinse);

    Shienshinse findshienshinseById(Integer id);
}
