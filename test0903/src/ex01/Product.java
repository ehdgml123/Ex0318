package ex01;

import java.util.Objects;

public class Product {
	
	String productID;
	
	String productName;
	
	String productPrice;
	
	public Product() {
		
	}
	
	
     public Product(String productID,String productName,String productPrice ) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	public String getProductID() {
		return productID;
	}


	public void setProductID(String productID) {
		this.productID = productID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
     
	
	@Override
	public int hashCode() {
		return productID.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.productID.equals( ((Product)obj).productID);
	}
}
