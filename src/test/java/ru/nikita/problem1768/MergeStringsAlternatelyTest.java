package ru.nikita.problem1768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    void when_givenTwoWordsOfSameLength_thenReturnAlternatingCharacters() {
        MergeStringsAlternately solution = new MergeStringsAlternately();

        String actual = solution.mergeAlternately("abc", "pqr");

        assertEquals("apbqcr", actual);
    }

    @Test
    void when_givenSecondWordLonger_thenAppendRemainingOfSecondWord() {
        MergeStringsAlternately solution = new MergeStringsAlternately();

        String actual = solution.mergeAlternately("ab", "pqrs");

        assertEquals("apbqrs", actual);
    }

    @Test
    void when_givenFirstWordLonger_thenAppendRemainingOfFirstWord() {
        MergeStringsAlternately solution = new MergeStringsAlternately();

        String actual = solution.mergeAlternately("abcd", "pq");

        assertEquals("apbqcd", actual);
    }
}