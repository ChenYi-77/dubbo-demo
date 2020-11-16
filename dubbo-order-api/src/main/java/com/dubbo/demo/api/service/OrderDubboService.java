package com.dubbo.demo.api.service;

import com.dubbo.demo.api.domain.OrderDomain;
import com.dubbo.demo.api.utils.RpcResult;

/**
 * @description:
 * @author: banxia
 * @create: 2020-11-09 17:23
 **/
public interface OrderDubboService {

    RpcResult<OrderDomain> getOrder();

}
