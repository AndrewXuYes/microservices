package com.xuzhennan.top.service;

import com.xuzhennan.top.model.Product;

import java.util.List;

public interface ProductService {

    Product creatProduct();

    Product deletcProduct();

    Product deletcAllProduct();

    Product changeProduct();

    Product findProduct();

    List<Product> findAllProduct();
}
