package com.labs;

import java.util.Arrays;

public class ArrayAbsoluteValue {
    /**
     * Given an array of integers 'nums', produce an array of integers composed of the absolute values of all the
     * numbers in 'nums'. Absolute value represents the distance from zero, so negative numbers should become positive
     * and positive numbers should stay the same.
     *
     * @param nums an array.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums) {
        int[] result = new int[nums.length];

        // Option 1. Manual absolute value calculation
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                result[i] = -nums[i];
            } else {
                result[i] = nums[i];
            }
        }
        return result;

        // Option 2. Built-in absolute value calculation
        // for (int i = 0; i < nums.length; i++) {
        //     result[i] = Math.abs(nums[i]);
        // }
        // return result;
    }

    // Main method for testing the class with mvn exec:java
    public static void main(String[] args) {
        ArrayAbsoluteValue abv = new ArrayAbsoluteValue();

        // Example input for testing
        int[] nums = {1, -3, 5, -6};
        System.out.println("Original array: " + Arrays.toString(nums));
        int[] absValues = abv.getArrayAbs(nums);
        System.out.println("Absolute value array: " + Arrays.toString(absValues));
    }
}