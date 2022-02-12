package com.xworkz.oops;
import java.util.Scanner;
public class Banktester { 
	 
		public static void main(String []args) { 
			Scanner sc=new Scanner(System.in); 
			Customer c1=new Customer(); 
			System.out.println("enter customer id:"); 
			c1.setId(sc.next()); 
			
			System.out.println("enter customer name:");  
			c1.setName(sc.next()); 
			
			System.out.println("enter customer accountnumber:"); 
			c1.setAccountnumber(sc.next());  
			
			System.out.println("enter customer ifsccode:"); 
			c1.setIfsccode(sc.next()); 
			
			System.out.println("enter customer sign"); 
			c1.setSign(sc.next());
			
			Bank b=new Bank(); 
			System.out.println("enter bank name:"); 
			b.setName(sc.next());  
			
			System.out.println("enter bankadress:"); 
			b.setAdress(sc.nextLine()); 
			 System.out.println("enter bank city:"); 
			 b.setCity(sc.next());  
			 System.out.println("enter bank branch:"); 
			 b.setBranch(sc.next());
			 b.setCustomer(c1); 
			 
			 System.out.println(b.getAll()); 
			 
			
			
			
			
			
			
		}
		

	}



