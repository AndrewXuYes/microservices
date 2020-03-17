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
    public int creatOrder(Order order) {
        return 0;
    }

    @Override
    public int deleteOrder(Long id) {
        return 0;
    }

    @Override
    public int changeOrder(Order order) {
        return 0;
    }

    @Override
    public Order findOrder(Long id) {
        return null;
    }
}
