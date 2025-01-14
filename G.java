package com.pattern;

public class G {
	public static void main(String[] args) {
         
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < i + 5; j++) {
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }
}
