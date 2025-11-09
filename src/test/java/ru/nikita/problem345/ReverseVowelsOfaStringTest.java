package ru.nikita.problem345;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfaStringTest {


    static Stream<ReverseVowelsOfaString> provideImplementation() {
        return Stream.of(
                new ReverseVowelsOfaStringV1(),
                new ReverseVowelsOfaStringV2()
        );
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenNormalWord_whenReverseVowels_thenVowelsReversed(ReverseVowelsOfaString solution) {
        String actual = solution.reverseVowels("hello");

        assertEquals("holle", actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenWordWithMultipleVowels_whenReversed_thenCorrectOrder(ReverseVowelsOfaString solution)  {
        String actual = solution.reverseVowels("leetcode");

        assertEquals("leotcede", actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenAllVowels_whenReversed_thenStringFullyReversed(ReverseVowelsOfaString solution)  {
        String actual = solution.reverseVowels("aeiou");

        assertEquals("uoiea", actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenNoVowels_whenReversed_thenStringUnchanged(ReverseVowelsOfaString solution)  {
        String actual = solution.reverseVowels("rhythm");

        assertEquals("rhythm", actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenMixedCaseVowels_whenReversed_thenCasePreserved(ReverseVowelsOfaString solution)  {
        String actual = solution.reverseVowels("aA");

        assertEquals("Aa", actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenEmptyString_whenReversed_thenReturnEmpty(ReverseVowelsOfaString solution)  {
        String actual = solution.reverseVowels("");

        assertEquals("", actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenSingleCharacter_whenReversed_thenReturnSame(ReverseVowelsOfaString solution)  {
        String actual = solution.reverseVowels("b");

        assertEquals("b", actual);
    }

    @ParameterizedTest(name ="Implementation = {0}")
    @MethodSource("provideImplementation")
    void givenSentenceWithSpaces_whenReversed_thenOnlyVowelsAffected(ReverseVowelsOfaString solution)  {
        String actual = solution.reverseVowels("I love Java");

        assertEquals("a lave JovI", actual);
    }
}
