package com.learning.core.day05;

import java.util.HashSet;
import java.util.Scanner;

public class D05P05 
{
	public static void main(String args[])
	{
		HashSet<Product> products = new HashSet<>();
		Scanner sc = new Scanner(System.in);
        Product product1 = new Product("P001", "Maruti 800");
        Product product2 = new Product("P002", "Maruti Zen");
        Product product3 = new Product("P003", "Maruti Dezire");
        Product product4 = new Product("P004", "Maruti Alto");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        
        System.out.print("Enter product id to remove : ");
		String idRemove = sc.next();
		Product productRemove = null;
		
		for (Product product : products) 
		{
            if (product.getProductId().equals(idRemove)) 
            {
                productRemove = product;
                break;
            }
        }
        if (productRemove != null) 
        {
            products.remove(productRemove);
        }
		
		
		for (Product product : products) 
		{
            System.out.println("Product ID: " + product.getProductId() + ", Product Name: " + product.getProductName());
        }
	}
}




