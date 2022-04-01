package com.north.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
public class Book {
    /**
     * 主键
     */
    private BigInteger id;
    /**
     * 书名
     */
    private String bookName;
    /**
     * 价格
     */
    private BigDecimal price;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
