package ru.nikita.problem1431;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithCandiesTest {

    static Stream<KidsWithCandies> provideImplementation() {
        return Stream.of(
                new KidsWithCandiesClassic(),
                new KidsWithCandiesStreamApi()
        );
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenNormalCase_whenExtraCandiesDistributed_thenReturnCorrectList(KidsWithCandies solution) {
        List<Boolean> actual = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);

        assertEquals(List.of(true, true, true, false, true), actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenSmallerExtraCandies_whenChecked_thenReturnCorrectList(KidsWithCandies solution) {
        List<Boolean> actual = solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);

        assertEquals(List.of(true, false, false, false, false), actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenMultipleKidsWithMaxCandies_whenChecked_thenReturnTrueForBoth(KidsWithCandies solution) {
        List<Boolean> actual = solution.kidsWithCandies(new int[]{12, 1, 12}, 10);

        assertEquals(List.of(true, false, true), actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenAllKidsHaveSameCandies_whenExtraGiven_thenAllTrue(KidsWithCandies solution) {
        List<Boolean> actual = solution.kidsWithCandies(new int[]{5, 5, 5, 5}, 2);

        assertEquals(List.of(true, true, true, true), actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenZeroExtraCandies_whenChecked_thenOnlyCurrentMaxTrue(KidsWithCandies solution) {
        List<Boolean> actual = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 0);

        assertEquals(List.of(false, false, true, false, false), actual);
    }
}
