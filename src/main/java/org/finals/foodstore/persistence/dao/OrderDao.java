package org.finals.foodstore.persistence.dao;

import java.util.List;

import org.finals.foodstore.persistence.entity.Order;

public interface OrderDao {
	public List<Order> findAll();

    public Order findById(final Integer id);

    void create(Order entity);

    Order update(Order entity);

    void delete(Order entity);

    void deleteById(Integer entityId);
}
