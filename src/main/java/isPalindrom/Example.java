package isPalindrom;

import java.util.Scanner;

public class Example {
    public static void main(String args[]) {
        System.out.println("Is aaa palindrom?: " + isPalindromeString("Aaa"));
        System.out.println("Is abc palindrom?: " + isPalindromeString("abc"));
        System.out.println("Is bbbb palindrom?: " + isPalindromeString("bbbb"));
        System.out.println("Is defg palindrom?: " + isPalindromeString("defg"));
        checkWord();

    }

    public static void checkWord() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a String");
        String input = reader.nextLine();
        System.out.printf("Is %s a palindrome? : %b %n", input, isPalindrome(input));
        System.out.println("Please enter another String");
        input = reader.nextLine();
        System.out.printf("Is %s a palindrome? : %b %n", input, isPalindrome(input));
        reader.close();

    }


    public static boolean isPalindromeString(String text) {
        String reverse = reverse(text);
        if (text.equals(reverse)) {
            return true;
        }
        return false;
    }


    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }
        char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(array[i]);
        }
        String reverseOfString = sb.toString();
        return input.equals(reverseOfString);
    }


}
