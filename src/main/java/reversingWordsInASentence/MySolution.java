package reversingWordsInASentence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        String test = "Java is best programming language";
        System.out.println(reverseWords(test));
    }

    public static String reverseWords(String sentence) {
        List<String> words = Arrays.asList(sentence.split("\\s"));
        Collections.reverse(words);
        StringBuilder res = new StringBuilder();
        for (String str : words) {
            res.append(str);
            res.append(" ");
        }
               return res.toString().trim();
    }
}
