package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        String[] words = {"bogo", "bubble", "heap", "insertion", "merge", "quick", "selection", "sorter", "thanos"};
    	int index = _01_LinearSearch.linearSearch(words, "heap");
        assertEquals(2, index);
    }
    @Test
    public void testLinearSearchFails() {
        // 1. Use the assertEquals() method to test your linear search method
        String[] words = {"bogo", "bubble", "heap", "insertion", "merge", "quick", "selection", "sorter", "thanos"};
    	int index = _01_LinearSearch.linearSearch(words, "sorting");
        assertEquals(-1, index);
    }
    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] array = {0, 2, 3, 4, 6, 9, 12, 15, 22, 56, 103, 114};
    	int index = _02_BinarySearch.binarySearch(array, 0, array.length, 103);
        assertEquals(10, index);
    }
}
