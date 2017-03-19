package org.finals.foodstore.persistence.dao;

import java.util.List;

import org.finals.foodstore.persistence.entity.Cuisine;

public interface CuisineDao {
	public List<Cuisine> findAll();

    public Cuisine findById(final Integer id);
    
    void create(Cuisine entity);

    Cuisine update(Cuisine entity);

    void delete(Cuisine entity);

    void deleteById(Integer entityId);
}
