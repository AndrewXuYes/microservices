package com.xuzhennan.top.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Test implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "test1")
    private Boolean test1;

    @ApiModelProperty(value = "test2")
    private String test2;

    @ApiModelProperty(value = "test3")
    private Date test3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getTest1() {
        return test1;
    }

    public void setTest1(Boolean test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public Date getTest3() {
        return test3;
    }

    public void setTest3(Date test3) {
        this.test3 = test3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", test1=").append(test1);
        sb.append(", test2=").append(test2);
        sb.append(", test3=").append(test3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}