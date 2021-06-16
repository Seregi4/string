package findDuplicatedCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        printDuplicated("kot");
    }

    public static void printDuplicated(String string) {
        char[] chars = string.toCharArray();
        //Create map
        Map<Character, Integer> mapCharacters = new HashMap<Character, Integer>();
        for (char ch : chars) {
            if (mapCharacters.containsKey(ch)) {
                mapCharacters.put(ch, mapCharacters.get(ch) + 1);
            } else {
                mapCharacters.put(ch, 1);
            }
        }
        //Iterate through HashMap to print all duplicate
        Set<Map.Entry<Character, Integer>> entrySet = mapCharacters.entrySet();
        System.out.println("List of duplicate characters in String "+string);
        for (Map.Entry<Character, Integer> item : entrySet) {
            if(item.getValue()>1){
                System.out.println(item.getKey()+" : "+item.getValue());
            }
        }
    }
}
