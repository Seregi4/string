package findDuplicatedCharacters;

import java.util.HashMap;
import java.util.Map;

public class MySolution {
    public static void main(String[] args) {
       getDuplicatedChars("baraban");
    }
    public static void getDuplicatedChars(String str) {

        HashMap<Character, Integer> mapChars = new HashMap<>();
        for (char ch : str.toCharArray()) {
            mapChars.put(ch, mapChars.containsKey(ch) ? mapChars.get(ch) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
