package com.learning.core.day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class D05P04 
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

        System.out.print("Enter product id to search for: ");
		String idSearch = sc.next();
        for (Product product : products) 
        {
            if (product.getProductId().equals(idSearch)) 
            {
                System.out.println("Product found");
                return;
            }
        }
        System.out.println("Product not found.");
     }
}
