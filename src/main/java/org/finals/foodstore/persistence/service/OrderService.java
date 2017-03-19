package org.finals.foodstore.persistence.service;

import java.util.List;

import org.finals.foodstore.persistence.dao.OrderDao;
import org.finals.foodstore.persistence.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService implements IOrderService {
	
	@Autowired
    private OrderDao dao;

    public List<Order> findAll() {
        return dao.findAll();
    }

    public Order findById(final Integer id) {
        return dao.findById(id);
    }

    public void create(final Order entity) {
    	dao.create(entity);
    }
}
