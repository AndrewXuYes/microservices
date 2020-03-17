package com.xuzhennan.top.service.impl;

import com.xuzhennan.top.mapper.ProductMapper;
import com.xuzhennan.top.model.Product;
import com.xuzhennan.top.model.ProductExample;
import com.xuzhennan.top.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public int creatProduct(Product productParams) {
        Product product = new Product();
        BeanUtils.copyProperties(productParams, product);
        //查询是否有相同用户名的用户
        ProductExample example = new ProductExample();
        example.createCriteria().andProductIdEqualTo(product.getProductId());
        List<Product> productList = productMapper.selectByExample(example);

        return productList.size() > 0 ? 0 : productMapper.insert(product);
    }

    @Override
    public int deletcProduct(Long product) {
        return productMapper.deleteByPrimaryKey(product);
    }

    @Override
    public int changeProduct(Product product) {
        return productMapper.updateByPrimaryKey(product);
    }

    @Override
    public Product findProduct(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
