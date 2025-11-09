package ru.nikita.problem345;

public class ReverseVowelsOfaStringV2 implements ReverseVowelsOfaString {

    private static final String vowels = "aeiouAEIOU";

    @Override
    public String reverseVowels(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        char[] world = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && vowels.indexOf(world[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(world[right]) == -1) {
                right--;
            }

            if( left < right ) {

                char swap = world[left];
                world[left] = world[right];
                world[right] = swap;

                left++;
                right--;
            }
        }

        return new String(world);
    }
}
