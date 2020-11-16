package com.dubbo.demo.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @description:
 * @author: banxia
 * @create: 2020-11-09 17:24
 **/
@Data
public class OrderDomain implements Serializable {
    private Integer id;
    private Integer orderNum;
    private LocalDateTime gmtCreate;

    public OrderDomain(Integer id, Integer orderNum, LocalDateTime gmtCreate) {
        this.id = id;
        this.orderNum = orderNum;
        this.gmtCreate = gmtCreate;
    }
}
