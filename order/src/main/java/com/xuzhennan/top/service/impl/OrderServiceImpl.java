package com.xuzhennan.top.service.impl;

import com.xuzhennan.top.mapper.OrderMapper;
import com.xuzhennan.top.model.Order;
import com.xuzhennan.top.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order creatOrder() {
        return null;
    }

    @Override
    public Order deleteOrder() {
        return null;
    }

    @Override
    public Order changeOrder() {
        return null;
    }

    @Override
    public Order findOrder() {
        return null;
    }

    @Override
    public Order findAllOrder() {
        return null;
    }
}
