package com.xuzhennan.top.service.impl;

import com.xuzhennan.top.mapper.TestMapper;
import com.xuzhennan.top.model.Test;
import com.xuzhennan.top.model.TestExample;
import com.xuzhennan.top.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> listAll() {
        return testMapper.selectByExample(new TestExample());
    }
}
