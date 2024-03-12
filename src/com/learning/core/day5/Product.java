package com.learning.core.day05;

public class Product 
{
    String productId;
    String productName;

    public Product(String productId, String productName) 
    {
    	this.productId = productId;
    	this.productName = productName;
	}

	public String getProductId() 
	{
		return productId;
	}

	public String getProductName() 
	{
		return productName;
	}
	    
	@Override
	public String toString() 
	{
		return productId + " " + productName;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
			return true;
	    if (obj == null || getClass() != obj.getClass()) 
	    	return false;
	    Product product = (Product) obj;
	        return productId == product.productId;
	}

	    @Override
	public int hashCode() 
	{
	    return productId.hashCode();
	}
}
