package firstNonRepeatingChar;

import java.util.*;

public class MySolution1 {
    public static void main(String[] args) {
        String str = "karat";

        System.out.println(getFirstNoDuplicatedChar(str));
        System.out.println(getFirstNotDuplicatedChar(str));
        System.out.println(firstNoRepeatingChar("baraban"));
    }

    public static char getFirstNoDuplicatedChar(String string) {
        Map<Character, Integer> mapChars = new LinkedHashMap<>(string.length());
        for (char c : string.toCharArray()) {
            mapChars.put(c, mapChars.containsKey(c) ? mapChars.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entryMap : mapChars.entrySet()) {
            if (entryMap.getValue() == 1) {
                return entryMap.getKey();
            }
        }
        throw new RuntimeException("Not duplicated chars");
    }

    public static char getFirstNotDuplicatedChar(String string) {
        Set<Character> repeat = new HashSet<>();
        List<Character> noRepeat = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);

            if (repeat.contains(letter)) {
                continue;
            }
            if (noRepeat.contains(letter)) {
                noRepeat.remove((Character) letter);
                repeat.add(letter);
            } else {
                noRepeat.add(letter);
            }
        }
        return noRepeat.get(0);
    }

    public static char firstNoRepeatingChar(String string) {
        Map<Character, Integer> mapScore = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (mapScore.containsKey(c)) {
                mapScore.put(c, mapScore.get(c) + 1);
            }else {
                mapScore.put(c,1);
            }
        }
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(mapScore.get(c)==1){
                return c;
            }
        }
        throw new RuntimeException("no Duplicated");
    }
}

