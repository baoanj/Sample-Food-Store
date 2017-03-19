package org.finals.foodstore.persistence.dao;

import org.finals.foodstore.persistence.entity.Cuisine;
import org.springframework.stereotype.Repository;

@Repository
public class CuisineDaoImpl extends AbstractJpaDao<Cuisine> implements CuisineDao {
	public CuisineDaoImpl() {
        super();

        setClazz(Cuisine.class);
    }
}
