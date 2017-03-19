package org.finals.foodstore.persistence.dao;

import java.util.List;

import org.finals.foodstore.persistence.entity.OrderLine;

public interface OrderLineDao {
	public List<OrderLine> findAll();

	public List<OrderLine> findByOrderid(final Integer id);
	
	void create(OrderLine entity);

	OrderLine update(OrderLine entity);

    void delete(OrderLine entity);

    void deleteById(Integer entityId);
}
