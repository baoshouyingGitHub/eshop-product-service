package com.roncoo.eshop.product.model;

public class ProductProperty {
	
	private Long id;
	private String name;
	private String value;
	private Long product_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Long getProductId() {
		return product_id;
	}
	public void setProductId(Long product_id) {
		this.product_id = product_id;
	}
	
}
