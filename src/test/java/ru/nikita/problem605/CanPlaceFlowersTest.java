package ru.nikita.problem605;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {
    @Test
    void givenEnoughSpace_whenCanPlaceAllFlowers_thenReturnTrue() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        boolean actual = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);

        assertTrue(actual);
    }

    @Test
    void givenEnoughSpaceForTwoFlowers_whenChecked_thenReturnTrue() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        boolean actual = solution.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 2);

        assertTrue(actual);
    }

    @Test
    void givenNoSpaceForExtraFlower_whenChecked_thenReturnFalse() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        boolean actual = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2);

        assertFalse(actual);
    }

    @Test
    void givenEmptyBed_whenPlacingSingleFlower_thenReturnTrue() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        boolean actual = solution.canPlaceFlowers(new int[]{0}, 1);

        assertTrue(actual);
    }

    @Test
    void givenFullBed_whenTryingToAddMoreFlowers_thenReturnFalse() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        boolean actual = solution.canPlaceFlowers(new int[]{1, 1, 1, 1, 1}, 1);

        assertFalse(actual);
    }

    @Test
    void givenSingleFlowerAlreadyPlanted_whenTryingToAddOneMore_thenReturnFalse() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        boolean actual = solution.canPlaceFlowers(new int[]{1}, 1);

        assertFalse(actual);
    }

    @Test
    void givenAlternatingPattern_whenChecked_thenReturnTrue() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        boolean actual = solution.canPlaceFlowers(new int[]{0, 1, 0, 1, 0, 1, 0}, 1);

        assertTrue(actual);
    }

    @Test
    void givenEmptyBed_whenZeroFlowersRequested_thenReturnTrue() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        boolean actual = solution.canPlaceFlowers(new int[]{0, 0, 0}, 0);

        assertTrue(actual);
    }
}