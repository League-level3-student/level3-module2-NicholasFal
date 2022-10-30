package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        String num1S = Integer.toString(num1);
        String num2S = Integer.toString(num2);
        String product = Integer.toString(num1 * num2);
    	String full = num1S + " x " + num2 + " = " + product;
        return full;
    }
    
    public static boolean isPrime(int num) {
    	boolean prime = true;
    	for(int i = 2; i < num - 1; i++) {
    	if(num % i == 0) {
    		prime = false;
    	}
    	}
    	return prime;
    }
    
    public static boolean isSquare(int num) {
    	boolean isSquare = false;
    	for(int i = 0; i <= num; i++) {
    		if(i * i == num) {
    			isSquare = true;
    		}
    	}
    	return isSquare;
    }
    
    public static boolean isCube(int num) {
    	boolean isCube = false;
    	for(int i = 0; i <= num; i++) {
    		if(i * i * i == num) {
    			isCube = true;
    		}
    	}
    	return isCube;
    }
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
