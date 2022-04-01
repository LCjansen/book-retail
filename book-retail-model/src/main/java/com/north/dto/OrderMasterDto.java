package com.north.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/29
 */
@Data
public class OrderMasterDto {
    @ApiModelProperty("订单主键")
    private BigInteger orderId;
    @ApiModelProperty("用户主键")
    private BigInteger userId;
    @ApiModelProperty("订单金额")
    private BigDecimal orderPrice;
}
