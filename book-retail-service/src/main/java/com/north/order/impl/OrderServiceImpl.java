package com.north.order.impl;

import com.north.mapper.OrderMapper;
import com.north.dto.AddOrderDto;
import com.north.dto.OrderMasterDto;
import com.north.dto.OrderQuery;
import com.north.entity.OrderItem;
import com.north.entity.OrderMaster;
import com.north.order.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Resource
    private OrderMapper orderMapper;

    @Transactional
    public void addOrder(AddOrderDto addOrderDto) {
        OrderMaster orderMaster = genOrderMaster(addOrderDto);
        orderMapper.addOrderMaster(orderMaster);
        orderMapper.addOrderItem(genOrderItemList(addOrderDto, orderMaster));
    }

    public List<OrderMasterDto> queryOrder(OrderQuery orderQuery) {
        return orderMapper.queryOrder(orderQuery);
    }

    private OrderMaster genOrderMaster(AddOrderDto addOrderDto) {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setUserId(addOrderDto.getUserId());
        orderMaster.setOrderPrice(addOrderDto.getOrderPrice());
        return orderMaster;
    }

    private List<OrderItem> genOrderItemList(AddOrderDto addOrderDto, OrderMaster orderMaster) {
        List<AddOrderDto.AddOrderItemDto> itemList = addOrderDto.getItemList();
        return itemList.stream().map(item -> {
            OrderItem orderItem = new OrderItem();
            orderItem.setOrderId(orderMaster.getId());
            orderItem.setProductId(item.getProductId());
            orderItem.setPrice(item.getPrice());
            return orderItem;
        }).collect(Collectors.toList());
    }
}
