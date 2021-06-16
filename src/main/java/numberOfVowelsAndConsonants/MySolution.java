package numberOfVowelsAndConsonants;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MySolution {
    public static void main(String[] args) {
        getVowels();
        System.out.println(getVowelsAndCosonants("krot"));
    }
    public static void getVowels() {
        System.out.println("Please enter some text");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        char[] letters = input.toCharArray();
        int count = 0;
        for (char c : letters) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
            }
        }
        System.out.println("Number of vowels in String [" + input + "] is : " + count);

    }

    public static String getVowelsAndCosonants(String str) {
        int vowels = 0;
        int consonants = 0;
        for (char ch : str.toCharArray()) {
            if (Pattern.matches("[aeiou]", Character.toString(ch))) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return new String("vowels = " + vowels + "\n" + "consonants = " + consonants);
    }
}
