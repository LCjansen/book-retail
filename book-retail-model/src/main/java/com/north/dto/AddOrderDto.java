package com.north.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/29
 */
@Data
public class AddOrderDto {
    @ApiModelProperty("用户ID")
    private BigInteger userId;
    @ApiModelProperty("订单金额")
    private BigDecimal orderPrice;
    @ApiModelProperty("订单明细")
    private List<AddOrderItemDto> itemList;

    @Data
    public static class AddOrderItemDto {
        @ApiModelProperty("商品主键")
        private BigInteger productId;
        @ApiModelProperty("价格")
        private BigDecimal price;
    }
}
