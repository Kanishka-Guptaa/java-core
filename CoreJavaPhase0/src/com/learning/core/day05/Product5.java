package com.learning.core.day05;

public class Product5 
{
	private String productId;
    private String productName;

    public Product5(String productId, String productName) 
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

    // Override equals() and hashCode() methods
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return this.productId.equals(other.productId);
    }

    @Override
    public int hashCode() 
    {
        return productId.hashCode();
    }
	
}


