package org.finals.foodstore.persistence.service;

import java.util.List;

import org.finals.foodstore.persistence.entity.Cuisine;

public interface ICuisineService {
	public List<Cuisine> findAll();

    public Cuisine findById(final Integer id);
    
    public void create(final Cuisine entity);
}
