package com.harry.mapper;

import com.harry.entity.Orders;
import com.harry.entity.User;

import java.util.List;

/**
 * create by harry on 2018/6/26
 */
public interface OrdersMapper {

    List<Orders> getOrders(User user);
    Orders getOrder(User user);
}
