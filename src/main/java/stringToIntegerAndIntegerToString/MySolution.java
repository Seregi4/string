package stringToIntegerAndIntegerToString;

public class MySolution {
    public static void main(String[] args) {

        //String to Integer

        //using Integer.parseInt
        int i = Integer.parseInt("432");
        System.out.println("i: " + i);

        //How to convert numeric string = "0044" into Integer value = 44
        int j = Integer.parseInt("0044");
        System.out.println("i: " + j);
//----------------------------------------------------------------------------------------------
        // Integer to String

        //use +
        String price = "" + 123456;
        System.out.println(price);

        //use StringBuilder
        String stringBuilder = new StringBuilder().append("").append(32).toString();
        System.out.println(stringBuilder);

        //use String.ValueOf()
        String number = String.valueOf(321);
        System.out.println(number);

        //use String.format
        String str = String.format("%d", 8432);
    }
}
