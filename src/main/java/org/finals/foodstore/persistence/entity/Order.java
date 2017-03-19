package org.finals.foodstore.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "myorder")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id = null;
    
    @Column
    private String createDate = null;
    
    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private List<OrderLine> orderLines = null;
    
    
    public Order() {
        super();
    }

    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(final String createDate) {
        this.createDate = createDate;
    }
    
    public List<OrderLine> getOrderLines() {
    	return this.orderLines;
    }
    public void setOrderLines(final List<OrderLine> orderLines) {
    	this.orderLines = orderLines;
    }
}

