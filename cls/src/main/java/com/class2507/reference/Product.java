package com.class2507.reference;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	
	private Address address;
//	@Autowired
//	public Product(Address address) {
//		super();
//		this.address = address;
//	}
//	

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Product [address=" + address + "]";
	}
	
	
	
	
}
