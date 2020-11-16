package com.dubbo.demo.provider.impl;

import com.dubbo.demo.api.domain.OrderDomain;
import com.dubbo.demo.api.service.OrderDubboService;
import com.dubbo.demo.api.utils.RpcResult;
import org.apache.dubbo.config.annotation.Service;

import java.time.LocalDateTime;

/**
 * @description:
 * @author: banxia
 * @create: 2020-11-09 17:28
 **/
@Service
public class OrderDubboServiceImpl implements OrderDubboService {
    @Override
    public RpcResult<OrderDomain> getOrder() {
        return RpcResult.success(new OrderDomain(1, 10086, LocalDateTime.now()));
    }
}
