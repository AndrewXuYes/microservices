package com.xuzhennan.top.service.impl;

import com.xuzhennan.top.mapper.ProductMapper;
import com.xuzhennan.top.model.Product;
import com.xuzhennan.top.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public Product creatProduct() {
        return null;
    }

    @Override
    public Product deletcProduct() {
        return null;
    }

    @Override
    public Product deletcAllProduct() {
        return null;
    }

    @Override
    public Product changeProduct() {
        return null;
    }

    @Override
    public Product findProduct() {
        return null;
    }

    @Override
    public List<Product> findAllProduct() {
        return null;
    }
}
