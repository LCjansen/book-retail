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
public class OrderMaster {
    /**
     * 主键
     */
    private BigInteger id;
    /**
     * 用户主键
     */
    private BigInteger userId;
    /**
     * 订单价格
     */
    private BigDecimal orderPrice;

}
