package highestOccurredCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class MySolution {
    public static void main(String[] args) {
        String string = " dsfakjlffffbwgbjhbxadhjab";
        System.out.println(string);
        System.out.println("Highest occurred char is : " + getMaxRepeatingChar(string));
    }

    public static char getMaxRepeatingChar(String str) {
        int maxValue = -1;
        char maxChar = '0';
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
        for (char ch : str.toCharArray()) {
            counts.put(ch, counts.containsKey(ch) ? counts.get(ch) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {

            if (entry.getValue() >= maxValue) {
                maxValue = entry.getValue();
                maxChar = entry.getKey();
                
            }

        }
        return maxChar;

    }
}
