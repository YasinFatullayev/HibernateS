package com.remoteTiger.HybernateDAO.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coffeea")
public class CoffeeBean {

	

	
	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
	private int id;
	
	
	
   @Column(name = "first_name")
	private String name;
	
   @Column(name = "country")
    private String country;
	
   @Column(name = "quantity")
    private int quantity;

   @Column(name = "productNo")
    private int PRODUCT_NO;

	
   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
   
   
   
   
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPRODUCT_NO() {
		return PRODUCT_NO;
	}

	public void setPRODUCT_NO(int PRODUCT_NO) {
		this.PRODUCT_NO = PRODUCT_NO;
	}
	
	
	
}
