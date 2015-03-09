package com.packt.webstore.domain;

import java.math.BigDecimal;


public class Product {
	private String productId;
	  private String name;
	  private BigDecimal unitPrice;
	  private String description;
	  private String manufacturer;
	  private String category;
	  private long unitsInStock;
	  private long unitsInOrder;
	  private boolean discontinued;
	private String condition;
	
	
	public String getProductId(){
		return productId;
	}
	public Product(){
		super();
	}
	public String getName(){
		return name;
	}
	public Product(String productID, String name, BigDecimal unitPrice){
		this.productId=productID;
		this.name=name;
		this.unitPrice=unitPrice;
	}
	//add setters and getters for all the fields here:
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Product other =(Product)obj;
		if(productId==null){
			if(other.productId==null)
				return false;
		}else if(!productId.equals(other.productId)){
			return false;
		}
		return true;
		
	}
	
	@Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result
	        + ((productId == null) ? 0 : productId.hashCode());
	    return result;
	  }
	@Override
	public String toString(){
		return "Product [productId="+productId+" name="+name+"]";
	}
	
	
	public void setDescription(String str){
		this.description=str;
	}
	public String getDescription(){
		return description;
	}

	
	public void setCategory(String str){
		this.category=str;
	}
	public String getCategory(){
		return category;
	}
	public void setManufacturer(String str){
		this.manufacturer=str;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public void setUnitsInStock(long data){
		this.unitsInStock=data;
	}
	public long getUnitsInStock(){
		return unitsInStock;
	}
	public BigDecimal getUnitPrice(){
		return unitPrice;
	}
}
