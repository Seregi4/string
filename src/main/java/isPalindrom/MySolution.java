package isPalindrom;

public class MySolution {
    public static void main(String[] args) {
        String text = "pop";
        String palindrome = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            palindrome += text.charAt(i);
        }
        System.out.println("is " + text + " palindrome? : " + text.equals(palindrome));
    }
}
