package reverseString;

public class Example {
    public static void main(String[] args) {
        //original string
        String string = "Sony is going to introduce Internet TV soon";
        System.out.println("Original string: " + string);

        //reversed string used StringBuffer
        String reversedString = new StringBuffer(string).reverse().toString();
        System.out.println("Reversed string using StringBuffer : " + reversedString);

        // iterative method to reverse String in Java
        System.out.println(reverse(string));
        // recursive method to reverse String in Java
        System.out.println(reverseRecursively(string));

    }

    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] stringChars = string.toCharArray();
        for (int i = stringChars.length - 1; i >= 0; i--) {
            stringBuilder.append(stringChars[i]);
        }
        return stringBuilder.toString();
    }

    public static String reverseRecursively(String string) {
        //base case to handle one char string and empty string
        if (string.length() < 2) {
            return string;
        }
        return reverseRecursively(string.substring(1)) + string.charAt(0);
    }

}
