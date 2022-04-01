package com.north.mapper;

import com.north.dto.OrderMasterDto;
import com.north.dto.OrderQuery;
import com.north.entity.OrderItem;
import com.north.entity.OrderMaster;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/29
 */
@Repository
public interface OrderMapper {
    int addOrderMaster(OrderMaster orderMaster);

    int addOrderItem(List<OrderItem> itemList);

    List<OrderMasterDto> queryOrder(OrderQuery orderQuery);

}
