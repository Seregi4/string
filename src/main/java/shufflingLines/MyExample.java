package shufflingLines;

public class MyExample {
    public static void main(String[] args) {
        String first = "бомж";
        String second = "крот";
        String result = "бкоромтж";
        System.out.println(first + " + " + second + ": is " + result);

        checkLength(first,second,result);
    }

    private static void checkPairs(String first, String second, String[] pairs) {
        int count = 0;
        for (int i = 0; i < pairs.length; i++) {
            String temp = pairs[i];
            boolean gotF = temp.contains(String.valueOf(first.charAt(i)));
            boolean gotS = temp.contains(String.valueOf(second.charAt(i)));
            if (gotF && gotS) {
                count++;
            } else {
                break;
            }
        }
        if (count == pairs.length) {
            System.out.println("Is true");
        }else {
            System.out.println("Is false");
        }
    }

    private static String[] getPairs(String result) {
        String fAndS = "";
        for (int i = 0; i < result.length(); i++) {
            fAndS += result.charAt(i);
            fAndS += result.charAt(i + 1);
            fAndS += " ";
            i++;
        }
        fAndS.trim();
        String[] pairs = fAndS.split(" ");
        return pairs;
    }
    public static void checkLength(String first,String second,String result){
        if(result.length()!=first.length()+second.length()){
            System.out.println("Not True");
        }
        else{
            String[] pairs = getPairs(result);
            checkPairs(first, second, pairs);
        }
    }
}





