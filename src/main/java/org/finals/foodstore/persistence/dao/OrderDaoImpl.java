package org.finals.foodstore.persistence.dao;

import org.finals.foodstore.persistence.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl extends AbstractJpaDao<Order> implements OrderDao {
	
	public OrderDaoImpl() {
        super();

        setClazz(Order.class);
    }

}
