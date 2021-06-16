package reverseString;

public class MySolution {
    public static void main(String[] args) {
        //original string
        String str = "Original";
        System.out.println(str);

        //reversed string used StringBuffer
        String reversString = new StringBuffer(str).reverse().toString();
        System.out.println(reversString);

        // iterative method to reverse String in Java
        System.out.println(reversed(str));

        // recursive method to reverse String in Java
        System.out.println(reversedRecursion(str));
    }

    public static String reversed(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] stringChars = string.toCharArray();
        for (int i = stringChars.length - 1; i >= 0; i--) {
            stringBuilder.append(stringChars[i]);
        }
        return stringBuilder.toString();
    }

    public static String reversedRecursion(String str) {
        if (str.length() < 2) {
            return str;
        }
        return reversedRecursion(str.substring(1)) + str.charAt(0);
    }
}
