package org.finals.foodstore.persistence.service;

import java.util.List;

import org.finals.foodstore.persistence.entity.Order;

public interface IOrderService {
	public List<Order> findAll();

    public Order findById(final Integer id);

    public void create(final Order entity);
}
