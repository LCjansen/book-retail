package com.north;

import com.north.dto.AddOrderDto;
import com.north.dto.OrderMasterDto;
import com.north.dto.OrderQuery;
import com.north.element.ApiResponse;
import com.north.order.IOrderService;
import com.north.order.handler.OrderPointHandler;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 羊排
 * @Description
 * @Date 2022/3/28
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Resource
    private IOrderService orderService;
    @Resource
    private OrderPointHandler orderPointHandler;

    @PostMapping("/add")
    @ApiOperation("下单")
    public ApiResponse<Integer> addOrder(@RequestBody AddOrderDto addOrderDto) {
        try {
            orderService.addOrder(addOrderDto);
            orderPointHandler.addPoint(addOrderDto);
            return ApiResponse.success();
        } catch (Exception e) {
            log.error("下单失败， 请求参数为{}，错误信息为{}", addOrderDto.toString(), e.getMessage());
            return ApiResponse.fail(500, "下单失败");
        }
    }

    /**
     * 这里不使用get请求是为了适配查询参数变多的场景
     * @param orderQuery
     * @return
     */
    @PostMapping("/query")
    @ApiOperation("查询订单")
    public ApiResponse<List<OrderMasterDto>> queryOrder(@RequestBody OrderQuery orderQuery) {
        try {
            return ApiResponse.success(orderService.queryOrder(orderQuery));
        } catch (Exception e) {
            log.error("查询订单失败，请求参数为{}，错误信息为{}", orderQuery.toString(), e.getMessage());
            return ApiResponse.fail(500, "查询订单失败");
        }
    }
}
