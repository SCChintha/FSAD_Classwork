package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	
	public Order() {
		this.orderId=101;
		this.customerName="Mahathi";
		this.quantity=3;
	}
	
	public void display() {
		System.out.println("The following are the order details:");
		System.out.println("OrderId:"+orderId);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("ProductId:"+product.getProductId());
		System.out.println("Product Name:"+product.getProductName());
		System.out.println("Product Price:"+product.getPrice());
		System.out.println("Product Category:"+product.getCategory());
		System.out.println("------------------------------------------------------------------");
	}
}
