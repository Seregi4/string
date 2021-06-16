package mostLongedPalindrom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MySolution {
    public static void main(String[] args) {
        getPalindrome("agk jeyee eyh gw");
        String str = "ABBA abraarba Hello asttsa oo ooo pop little";
        getPalindromeLong(str);
    }

    public static void getPalindrome(String str) {
        String string = str.replaceAll(" ", "");
        List<String> palindromeList = new ArrayList<>();

        for (int charIdx = 0; charIdx < string.length() - 1; charIdx++) {

            int start = charIdx - 1;
            int end = charIdx + 1;

            while (end < string.length() && string.charAt(charIdx) == string.charAt(end)) {
                end++;
            }
            charIdx = end - 1;

            while (start >= 0 && end < string.length()) {
                if (string.charAt(start) == string.charAt(end)) {
                    start--;
                    end++;
                } else {
                    break;
                }
            }

            if (end - start >= 3) {
                palindromeList.add(string.substring(start + 1, end));
            }
        }

        palindromeList.sort(Comparator.comparing(String::length));
        System.out.println(palindromeList.get(palindromeList.size() - 1));
    }


    public static void getPalindromeLong(String str) {

        String[] list = str.split("\\p{Space}");
        List<String> pal = Stream.of(list).filter(s -> s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
        String longest = pal.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("Longest palindrom word: " + longest);
    }
}
