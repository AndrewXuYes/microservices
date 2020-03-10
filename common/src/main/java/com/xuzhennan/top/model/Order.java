package com.xuzhennan.top.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "用户")
    private String user;

    @ApiModelProperty(value = "产品")
    private String product;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "价格")
    private Float sumprice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getSumprice() {
        return sumprice;
    }

    public void setSumprice(Float sumprice) {
        this.sumprice = sumprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", product=").append(product);
        sb.append(", number=").append(number);
        sb.append(", sumprice=").append(sumprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}