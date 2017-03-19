package org.finals.foodstore.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.finals.foodstore.persistence.entity.OrderLine;
import org.springframework.stereotype.Repository;

@Repository
public class OrderLineDaoImpl extends AbstractJpaDao<OrderLine> implements OrderLineDao {
	
	public OrderLineDaoImpl() {
        super();

        setClazz(OrderLine.class);
    }

	@SuppressWarnings("unchecked")
	public List<OrderLine> findByOrderid(Integer id) {
		String sql = "select * from orderline where oid = :oid";
		Query query = entityManager.createNativeQuery(sql, OrderLine.class);
		query.setParameter("oid", id);
		return new ArrayList<OrderLine>(query.getResultList());
	}

}
