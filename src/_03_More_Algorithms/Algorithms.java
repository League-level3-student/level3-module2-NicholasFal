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
        int brokenIndex = -1;
    	for(int i = 0; i < eggs.size(); i++) {
        	if(eggs.get(i).equalsIgnoreCase("cracked")) {
        		if(brokenIndex == -1) {
        			brokenIndex = i;
        		}
        	}
        }
    	return brokenIndex;
    }
    public static int countPearls(List<Boolean> oysters) {
    	int pearls = 0;
    	for(int i = 0; i < oysters.size(); i++) {
    		if(oysters.get(i)) {
    			pearls++;
    		}
    	}
    	return pearls;
    }
    public static double findTallest(List<Double> peeps) {
    	double tallestHeight = 0;
    	for(int i = 0; i < peeps.size(); i++) {
    		if(peeps.get(i) > tallestHeight) {
    			tallestHeight = peeps.get(i);
    		}
    	}
    	return tallestHeight;
    }
    public static String findLongestWord(List<String> words) {
    	String longWord = "";
    	for(int i = 0; i < words.size(); i++) {
    		if(words.get(i).length() > longWord.length()) {
    			longWord = words.get(i);
    		}
    	}
    	return longWord;
    }
    public static Boolean containsSOS(List<String> message) {
    	boolean sos = false;
    	for(int i = 0; i < message.size(); i++) {
    		if(message.get(i).equalsIgnoreCase("... --- ...")) {
    			sos = true;
    		}
    	}
    	return sos;
    }
    public static List<Double> sortScores(List<Double> results) {
    	List<Double> sample = results;
    	for(int i = 0; i < sample.size(); i++) {
    	for(int k = 0; k < sample.size() - 1; k++) {
    		if(sample.get(k) > sample.get(k+1)) {
    			double temp = sample.get(k);
    			sample.set(k, sample.get(k+1));
    			sample.set(k+1, temp);
    		}
    	}
    	}
    	return sample;
    }
    
    public static List<String> sortDNA(List<String> unsortedSequences) {
    	List<String> sample = unsortedSequences;
    	for(int i = 0; i < sample.size(); i++) {
    		for(int k = 0; k < sample.size() - 1; k++) {
    			if(sample.get(k).length() > sample.get(k+1).length()) {
    				String temp = sample.get(k);
    				sample.set(k, sample.get(k+1));
    				sample.set(k+1, temp);
    			}
    		}
    	}
    	return sample;
    }
    public static List<String> sortWords(List<String> words) {
    	List<String> sample = words;
    	for(int i = 0; i < sample.size(); i++) {
    		for(int k = 0; k < sample.size() - 1; k++) {
    			if(sample.get(k).compareTo(sample.get(k+1)) > 0) {
    				String temp = sample.get(k);
    				sample.set(k, sample.get(k+1));
    				sample.set(k+1, temp);
    			}
    		}
    	}
    	return sample;
    }
}
