package removeDuplicateCharacters;

import java.util.HashMap;

public class MySolution {
    public static void main(String[] args) {
        String str = "baraban";
        System.out.println(str.replaceAll("(.)(?=.*\\1)", ""));
        removeDuplicate("baraban");
    }

    public static void removeDuplicate(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : string.toCharArray()) {
            if(map.containsKey(ch)){
                continue;
            }else {
                map.put(ch,0);
                System.out.print(ch);
            }
        }

    }
}
