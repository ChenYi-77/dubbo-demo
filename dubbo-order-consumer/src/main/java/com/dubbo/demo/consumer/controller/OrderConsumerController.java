package com.dubbo.demo.consumer.controller;

import com.dubbo.demo.api.service.OrderDubboService;
import com.dubbo.demo.api.utils.RpcResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: banxia
 * @create: 2020-11-09 17:32
 **/
@RestController
@RequestMapping("/order")
public class OrderConsumerController {

    @Reference
    OrderDubboService orderDubboService;

    @GetMapping("getOrder")
    public RpcResult getOrder() {
        return orderDubboService.getOrder();
    }

}
