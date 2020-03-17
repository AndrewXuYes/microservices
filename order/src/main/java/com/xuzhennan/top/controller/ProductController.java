package com.xuzhennan.top.controller;

import com.xuzhennan.top.api.CommonResult;
import com.xuzhennan.top.model.Product;
import com.xuzhennan.top.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author andrew
 * @date 2020/2/24 22:26
 */
@Controller
@ResponseBody
@RequestMapping("/product")
@Api(tags = "ProductController", description = "产品管理")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation("创建产品")
    @RequestMapping("/creatproduct")
    public CommonResult<Integer> creatproduct(Product product) {
        int creatproduct = productService.creatProduct(product);
        return CommonResult.success(creatproduct);
    }

    @ApiOperation("删除产品")
    @RequestMapping("/deleteproduct")
    public CommonResult<Integer> deleteproduct(Long id) {
        int creatproduct = productService.deletcProduct(id);
        return CommonResult.success(creatproduct);
    }

    @ApiOperation("修改产品")
    @RequestMapping("/changeproduct")
    public CommonResult<Integer> changeproduct(Product product) {
        int creatproduct = productService.changeProduct(product);
        return CommonResult.success(creatproduct);
    }

    @ApiOperation("查找产品")
    @RequestMapping("/findproduct")
    public CommonResult<Product> findproduct(Long id) {
        Product product = productService.findProduct(id);
        return CommonResult.success(product);
    }

}
