package ru.nikita.problem345;

import java.util.Set;

public class ReverseVowelsOfaStringV1 implements ReverseVowelsOfaString {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    private boolean isNotVowels(Character character) {
        return !VOWELS.contains(Character.toLowerCase(character));
    }


    @Override
    public String reverseVowels(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        StringBuilder returnVal = new StringBuilder(s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && isNotVowels(returnVal.charAt(left))) {
                left++;
            }

            while (left < right && isNotVowels(returnVal.charAt(right))) {
                right--;
            }

            if( left < right ) {

                char swap = returnVal.charAt(left);
                returnVal.setCharAt(left, returnVal.charAt(right));
                returnVal.setCharAt(right, swap);

                left++;
                right--;
            }
        }

        return returnVal.toString();
    }
}