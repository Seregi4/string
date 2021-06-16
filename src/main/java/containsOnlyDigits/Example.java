package containsOnlyDigits;

import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        //Regular expression in Java to check if String is number or not
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        String[] inputs = {"123", "-123", "123.45", "ab12" };
        for (String input : inputs) {
            System.out.println("does" + input + " is number : " + !pattern.matcher(input).matches());
        }
        // Regular expression to check is 6 digit number or not
        String[] inputss = {"123", "4123", "123.45", "ab12", "654321" };
        Pattern pat = Pattern.compile("\\d{6}");
        for (String inp : inputss) {
            System.out.println("does " + inp + " is 6 digit numbers : " + pat.matcher(inp).matches());

        }
    }
}
