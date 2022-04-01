package com.north.order;

import com.north.dto.AddOrderDto;
import com.north.dto.OrderMasterDto;
import com.north.dto.OrderQuery;

import java.util.List;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
public interface IOrderService {
    void addOrder(AddOrderDto addOrderDto);

    List<OrderMasterDto> queryOrder(OrderQuery orderQuery);
}
