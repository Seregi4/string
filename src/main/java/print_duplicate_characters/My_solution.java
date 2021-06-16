package print_duplicate_characters;


public class My_solution {

    public static void main(String[] args) {
        String string = "baraban";
        getDuplicate(string);
    }

    private static void getDuplicate(String string) {
        int count = 1;
        char[] myString = string.toCharArray();
        System.out.println("Use word " + string);

        for (int i = 0; i < myString.length; i++) {
            for (int j = i + 1; j < myString.length; j++) {
                if (myString[i] == myString[j] && myString[j] != 0) {
                    count++;
                    myString[j] = 0;
                }
            }
            if (count > 1) {
                System.out.println(myString[i] + ":" + count);
                count = 1;

            }

        }
    }
}




