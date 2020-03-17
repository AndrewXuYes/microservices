package com.xuzhennan.top.service;

import com.xuzhennan.top.model.Product;
import org.springframework.transaction.annotation.Transactional;

public interface ProductService {

    @Transactional
    int creatProduct(Product product);

    int deletcProduct(Long id);

    int changeProduct(Product product);

    Product findProduct(Long id);
}
