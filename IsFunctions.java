package org.jclass.main;

public class IsFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="57";	

		System.out.println("The given number " +s +" is Integer (true/false)?   "+isInteger(s) );
		System.out.println("The given number " +s +" is odd (true/false)?       "+isOddNumber(s) );
		System.out.println("The given number " +s +" is Even (true/false)?         "+isEvenNumber(s) );
		System.out.println("The given number " +s +" is Prime (true/false)?       "+isPrimeNumber(s) );
		
	}	
	
	
	public static Boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return(true);
		}
		catch(NumberFormatException nfe)  {
			return(false);
			
		}
	}
	public static Boolean isOddNumber(String s) {
		int n=Integer.parseInt(s);
		if(n % 2 == 0) {
			return false;
		} 
		else
			return true;
			
	}
	
	public static Boolean isEvenNumber(String s) {
		int n=Integer.parseInt(s);
		if(n % 2 == 0) {
			return true;
		} 
		else
			return false;
			
	}
	
	public static Boolean isPrimeNumber(String s) {
		Boolean flag=true;
		int n=Integer.parseInt(s);	
		if (n <= 1) 
	        flag= false; 
	  
	    // Check from 2 to n-1 
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) { 
	            flag= false;
	        }
	  
	    
	    }
		return (flag);
	}
}
