package ru.nikita.problem1431;

import java.util.Arrays;
import java.util.List;

public class KidsWithCandiesStreamApi implements KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().orElse(0);

        return Arrays.stream(candies).mapToObj(c -> c + extraCandies >= maxCandies).toList();
    }
}
