package ru.nikita.problem283;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class MoveZeroesTest {

    @Test
    void givenArrayWithZeros_whenMoved_thenZerosAtEndAndOrderPreserved() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void givenArrayWithSingleZero_whenMoved_thenUnchanged() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void givenArrayWithoutZeros_whenMoved_thenUnchanged() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {1, 2, 3, 4};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 4}, nums);
    }

    @Test
    void givenAllZeros_whenMoved_thenUnchanged() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 0, 0, 0};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{0, 0, 0, 0}, nums);
    }

    @Test
    void givenZerosAtEnd_whenMoved_thenUnchanged() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {1, 2, 3, 0, 0};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, nums);
    }

    @Test
    void givenZerosAtStart_whenMoved_thenShiftNonZerosLeft() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 0, 1, 2, 3};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, nums);
    }

    @Test
    void givenAlternatingZeros_whenMoved_thenAllZerosShiftedRight() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 2, 0, 3};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0}, nums);
    }

    @Test
    void givenNegativeAndPositiveNumbers_whenMoved_thenOrderPreservedAndZerosAtEnd() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, -1, 0, 2, -3, 0, 4};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{-1, 2, -3, 4, 0, 0, 0}, nums);
    }

    @Test
    void givenEmptyArray_whenMoved_thenUnchanged() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{}, nums);
    }
}
