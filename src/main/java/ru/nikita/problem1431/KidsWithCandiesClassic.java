package ru.nikita.problem1431;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandiesClassic implements KidsWithCandies {
    @Override
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> returnVal = new ArrayList<>();

        for (int candie : candies) {
            if (maxCandies < candie) {
                maxCandies = candie;
            }
        }

        for (int candie : candies) {
            returnVal.add( candie + extraCandies >= maxCandies);
        }

        return returnVal;
    }
}
