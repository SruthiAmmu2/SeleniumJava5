package com.ProblemStatement7.entity;

public class Constructors {
	
	
	public static void main(String[] args) {
	
		int n, i , num;
		NaturalNumbers obj1 = new NaturalNumbers();
	    
		System.out.println("Value of n when constructor is called: " + obj1.n);
		System.out.println("Value of y when constructor is called: " + obj1.i);
		
		NaturalNumbers obj2 = new NaturalNumbers(2,2);
		System.out.println("Value of y when constructor is called: " + obj2.n);
		System.out.println("Value of y when constructor is called: " + obj2.i);		
		
		for(n=1;n<=5;n++)
		{
			for(i=1;i<=10;i++)
			{	
	    		num = n*i;	
	    		System.out.println("Multiples of" +n);
	    		System.out.println(+num);					
	        }
		}
	}
}
	