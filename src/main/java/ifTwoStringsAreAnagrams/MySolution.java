package ifTwoStringsAreAnagrams;

import java.util.Arrays;

public class MySolution {
    public static void main(String[] args) {
        String wordFirst = "kot";
        String wordSecond = "tos";
        System.out.println(isAnagram(wordFirst,wordSecond));
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        if (first.length != second.length) {
            System.out.println(" Is not Anagrams by length");
        }

        return   Arrays.equals(first, second);

    }
}
