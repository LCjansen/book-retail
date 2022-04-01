package com.north.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
@Data
public class OrderItem {
    /**
     * 主键
     */
    private BigInteger id;
    /**
     * 订单主键
     */
    private BigInteger orderId;
    /**
     * 商品主键
     */
    private BigInteger productId;
    /**
     * 价格
     */
    private BigDecimal price;
}
