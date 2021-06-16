package stringToIntegerAndIntegerToString;

public class Example {
    public static void main(String[] args) {

        //String to Integer

        //using Integer.parseInt
        int i = Integer.parseInt("123");
        System.out.println("i: " + i);

        //How to convert numeric string = "000000081" into Integer value = 81
        int j = Integer.parseInt("000000081");
        System.out.println("i: " + j);

        // Integer to String

        //use +
        String price = "" + 123;
        System.out.println(price);

        //use StringBuilder
        String stringBuilder = new StringBuilder().append("").append(10).toString();
        System.out.println(stringBuilder);

        //use String.ValueOf()
        String number = String.valueOf(123);
        System.out.println(number);

        //use String.format
        String str = String.format("%d", 457);
    }
}
