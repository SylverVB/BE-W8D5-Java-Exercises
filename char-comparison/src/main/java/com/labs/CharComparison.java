package com.labs;

public class CharComparison {

    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexicographically.
     * That means its position in a dictionary, e.g.:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b) {   
        int minLength = Math.min(a.length, b.length);

        for (int i = 0; i < minLength; i++) {
            if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }

        // If all characters are the same for the length of the shorter array,
        // we need to compare lengths: longer array is lexicographically larger
        if (a.length > b.length) {
            return 1;
        } else if (a.length < b.length) {
            return -1;
        }

        return 0;
    }

    // Main method to execute the CharComparison
    public static void main(String[] args) {
        CharComparison cc = new CharComparison();
        
        // Example comparisons
        char[] input1 = {'c', 'a', 't'};
        char[] input2 = {'d', 'o', 'g'};
        System.out.println("Comparison result for 'cat' vs 'dog': " + cc.compare(input1, input2));  // Expected: -1

        char[] input3 = {'m', 'o', 'u', 's', 'e'};
        char[] input4 = {'d', 'o', 'g'};
        System.out.println("Comparison result for 'mouse' vs 'dog': " + cc.compare(input3, input4));  // Expected: 1

        char[] input5 = {'m', 'o', 'u', 's', 'e'};
        char[] input6 = {'m', 'o', 'u', 's', 'e'};
        System.out.println("Comparison result for 'mouse' vs 'mouse': " + cc.compare(input5, input6));  // Expected: 0
    }
}