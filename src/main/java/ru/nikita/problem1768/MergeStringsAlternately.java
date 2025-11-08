package ru.nikita.problem1768;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder returnVal = new StringBuilder();

        boolean isWord1Turn = true;

        int word1Index = 0;
        int word2Index = 0;

        int word1Len = word1.length();
        int word2Len = word2.length();

        while (word1Index < word1Len && word2Index < word2Len) {
            if(isWord1Turn) {
                returnVal.append(word1.charAt(word1Index++));
            } else {
                returnVal.append(word2.charAt(word2Index++));
            }

            isWord1Turn = !isWord1Turn;
        }

        if (word1Index < word1Len) {
            returnVal.append(word1, word1Index, word1Len);
        }

        if (word2Index < word2Len) {
            returnVal.append(word2, word2Index, word2Len);
        }

        return returnVal.toString();
    }
}
