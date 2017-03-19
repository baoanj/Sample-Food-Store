package org.finals.foodstore.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cuisine implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id = null;
    
    @Column
    private String name = null;
    
    @Column
    private Double price = null;
    
    
    public Cuisine() {
        super();
    }

    public Cuisine(final Integer id, final String name, final Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public String getName() {
    	return this.name;
    }
    public void setName(final String name) {
    	this.name = name;
    }
    
    public Double getPrice() {
    	return this.price;
    }
    public void setPrice(final Double price) {
    	this.price = price;
    }
}

