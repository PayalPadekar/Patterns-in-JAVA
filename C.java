package com.pattern;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= 5; j++) {
		            	if(i==1 || i==5 ||j==1 || j==5 ) {
		            		
		                System.out.print("*"); // Print '*' on the same line
		            }else {
		            System.out.print(" "); // Move to the next line after inner loop
		        }
		    }
		            System.out.println();        
		}
	}

}
