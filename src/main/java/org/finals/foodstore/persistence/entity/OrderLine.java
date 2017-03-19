package org.finals.foodstore.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrderLine implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @OneToOne
    @JoinColumn(name = "cid")
    private Cuisine cuisine = null;
    
    @Column
    private Integer amount = null;
    
    @Column
    private Double purchasePrice = null;
    
    @ManyToOne
    @JoinColumn(name = "oid")
    private Order order = null;
    
    
    public OrderLine() {
        super();
    }
    
    
    public Order getOrder() {
        return this.order;
    }
    public void setOrder(final Order order) {
        this.order = order;
    }

    
    public Integer getAmount() {
    	return amount;
    }
    public void setAmount(final Integer i) {
    	this.amount = i;
    }
    
    public Double getPurchasePrice() {
    	return this.purchasePrice;
    }
    public void setPurchasePrice(final Double price) {
    	this.purchasePrice = price;
    }
    
    public Cuisine getCuisine() {
        return this.cuisine;
    }
    public void setCuisine(final Cuisine cuisine) {
        this.cuisine = cuisine;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cuisine.getName() == null) ? 0 : cuisine.getName().hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final OrderLine other = (OrderLine) obj;
        if (cuisine.getName() == null) {
            if (other.cuisine.getName() != null)
                return false;
        } else if (!cuisine.getName().equals(other.cuisine.getName()))
            return false;
        return true;
    }
}

