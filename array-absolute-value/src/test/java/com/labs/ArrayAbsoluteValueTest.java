package com.labs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayAbsoluteValueTest {
    ArrayAbsoluteValue abv = new ArrayAbsoluteValue();

    /**
     * Given an input of {1, -3, 5, -6}, the absolute value of input is {1, 3, 5, 6}.
     */
    @Test
    public void abvTest1() {
        int[] nums = {1, -3, 5, -6};
        int[] target = {1, 3, 5, 6};
        assertArrayEquals(target, abv.getArrayAbs(nums));
    }

    /**
     * Given an input of {1, 3, 5, 6}, the absolute value of input is {1, 3, 5, 6}.
     */
    @Test
    public void abvTest2() {
        int[] nums = {1, 3, 5, 6};
        int[] target = {1, 3, 5, 6};
        assertArrayEquals(target, abv.getArrayAbs(nums));
    }

    /**
     * Given an input of {-4, -2}, the absolute value of input is {4, 2}.
     */
    @Test
    public void abvTest3() {
        int[] nums = {-4, -2};
        int[] target = {4, 2};
        assertArrayEquals(target, abv.getArrayAbs(nums));
    }

    /**
     * Given an input of {9, 5, -4, 0, 2}, the absolute value of input is {9, 5, 4, 0, 2}.
     */
    @Test
    public void abvTest4() {
        int[] nums = {9, 5, -4, 0, 2};
        int[] target = {9, 5, 4, 0, 2};
        assertArrayEquals(target, abv.getArrayAbs(nums));
    }
}