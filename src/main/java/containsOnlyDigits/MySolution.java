package containsOnlyDigits;

import java.util.regex.Pattern;

public class MySolution {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile(".*[^0-9].*");
        String[] strings = {"3213", "sad5432sa", "-2122" };
        for (String str : strings) {
            System.out.println("does " + str + " is digit : " + !pat.matcher(str).matches());
        }
        Pattern pat1 = Pattern.compile("\\d{4}");
        for (String str : strings) {
            System.out.println("does "+ str + " is 3 digit number "+ pat1.matcher(str).matches());
        }

    }
}
