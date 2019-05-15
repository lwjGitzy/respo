package com.jk.model;

import java.io.Serializable;

/**
 * @program: springcloud2
 * @Date: 2019/5/13 17:49
 * @Author: 任豪杰
 * @Description:
 */
public class GoodsBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;
    private Integer id;
    private String name;
    private Double price;
    private Integer stock;
    private String createtime;

  /*  public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }*/


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "GoodsBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
