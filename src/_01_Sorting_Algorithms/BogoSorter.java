package _01_Sorting_Algorithms;

import java.util.Random;

import _00_Intro_to_Sorting_Algorithms._01_SortedArrayChecker;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	boolean sorted = false;
    	while(!_01_SortedArrayChecker.intArraySorted(array)) {
    		Random ran = new Random();
    		int k = ran.nextInt(array.length);
    		int l = ran.nextInt(array.length);
    		int temp = array[k];
    		array[k] = array[l];
    		array[l] = temp;
            display.updateDisplay();
    	}
    }
}
