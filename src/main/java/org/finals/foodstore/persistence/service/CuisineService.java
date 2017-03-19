package org.finals.foodstore.persistence.service;

import java.util.List;

import org.finals.foodstore.persistence.dao.CuisineDao;
import org.finals.foodstore.persistence.entity.Cuisine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CuisineService implements ICuisineService {
	
	@Autowired
    private CuisineDao dao;

    public List<Cuisine> findAll() {
        return dao.findAll();
    }

    public Cuisine findById(final Integer id) {
        return dao.findById(id);
    }
    
    public void create(final Cuisine entity) {
    	dao.create(entity);
    }
    
}
