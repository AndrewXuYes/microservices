package com.xuzhennan.top.service;


import com.xuzhennan.top.model.Order;

public interface OrderService {

    int creatOrder(Order order);

    int deleteOrder(Long id);

    int changeOrder(Order order);

    Order findOrder(Long id);

}
