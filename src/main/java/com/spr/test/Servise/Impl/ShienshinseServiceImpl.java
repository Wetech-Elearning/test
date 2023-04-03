package com.spr.test.Servise.Impl;

import com.spr.test.Servise.ShienshinseService;
import com.spr.test.entity.Shienshinse;
import com.spr.test.mapper.ShienshinseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShienshinseServiceImpl implements ShienshinseService {
    @Autowired
    private ShienshinseMapper shienshinseMapper;

    @Override
    public void save(Shienshinse shienshinse){
        shienshinseMapper.insert(shienshinse);
    }

    @Override
    public Shienshinse findshienshinseById(Integer id) {
        return shienshinseMapper.findById(id);
    }
}
