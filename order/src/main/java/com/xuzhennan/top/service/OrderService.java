package com.xuzhennan.top.service;


import com.xuzhennan.top.model.Order;

public interface OrderService {

    Order creatOrder();

    Order deleteOrder();

    Order changeOrder();

    Order findOrder();

    Order findAllOrder();

}
