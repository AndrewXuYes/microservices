package com.xuzhennan.top.service;


import com.xuzhennan.top.model.Order;

public interface OrderService {

    Order creatOrder(Order order);

    Order deleteOrder(Long id);

    Order changeOrder(Order order);

    Order findOrder(Long id);

}
