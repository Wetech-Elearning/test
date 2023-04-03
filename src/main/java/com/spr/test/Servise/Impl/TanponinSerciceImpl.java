package com.spr.test.Servise.Impl;

import com.spr.test.Servise.TanponinService;
import com.spr.test.entity.Tanponin;
import com.spr.test.entity.User;
import com.spr.test.mapper.TanponinMapper;
import com.spr.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TanponinSerciceImpl implements TanponinService {
    @Autowired
    private TanponinMapper tanponinMapper;

    @Override
    public void save(Tanponin tanponin) {
        tanponinMapper.insert(tanponin);
    }

    @Override
    public Tanponin findTanponinById(Integer id) {
        return tanponinMapper.findById(id);
    }
}
