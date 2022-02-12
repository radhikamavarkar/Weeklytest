package com.xworkz.oops;

public class Student { 
	 
		static String names[]={"null","null","null","null","null","null","null","null","null","null","null"};
			

		static void printAll()
		{ 
			for(int index=0;index<names.length; index++)
			{ 
			System.out.println(names[index]+"\t"); 
		} 
		System.out.println(); 
	  
		}
		
		static void updateName(String oldName,String newName)
		{  
			for(int index=0;index<names.length; index++)
			{ 
				if(oldName.equals (names[index]))
				{ 
					names[index]=newName;    
				}
			}
		
		}


