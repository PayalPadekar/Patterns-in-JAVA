package com.pattern;

public class I {

	public static void main(String[] args) {
		 

        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 3; j++) {
                System.out.print(j);
            }
            
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            
            for (int j = 7; j <= 9; j++) {
                System.out.print(j);
            }
            System.out.println(); 
        }
    }

}
