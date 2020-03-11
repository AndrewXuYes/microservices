package com.xuzhennan.top.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;

    private String productname;

    private String username;

    private Long sumprice;

    private Integer number;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getSumprice() {
        return sumprice;
    }

    public void setSumprice(Long sumprice) {
        this.sumprice = sumprice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productname=").append(productname);
        sb.append(", username=").append(username);
        sb.append(", sumprice=").append(sumprice);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}