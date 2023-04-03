package com.spr.test.Servise;

import com.spr.test.entity.Tanponin;
import com.spr.test.entity.User;

public interface TanponinService {
    void save(Tanponin tanponin);

    Tanponin findTanponinById(Integer id);
}
