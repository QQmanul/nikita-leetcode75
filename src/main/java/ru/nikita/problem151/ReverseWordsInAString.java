package ru.nikita.problem151;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] worlds = s.trim().split("\\s+");

        StringBuilder builder = new StringBuilder();

        for (int i = worlds.length -1; i >= 0; i--) {

            builder.append(worlds[i].trim());
            builder.append(" ");
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAString().reverseWords("  hello world  "));
    }
}
