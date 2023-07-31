package com.cg.daythree;

public class Constructor {

		int id=56;  
		String name="abc";  
		//method to display the value of id and name  
		void display(){System.out.println(id+" "+name);}  
		  
		public static void main(String args[]){  
		//creating objects  
		Constructor s1=new Constructor();  
		Constructor s2=new Constructor();  
		//displaying values of the object  
		s1.display();  
		//s2.display(); 
}
}