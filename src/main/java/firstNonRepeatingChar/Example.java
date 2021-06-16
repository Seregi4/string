package firstNonRepeatingChar;


import java.util.*;


public class Example {
    public static void main(String[] args) {
        String string = "karakurt";
        System.out.println(firstNonRepeatingChar(string));
        System.out.println(firstNonRepeatedCharacter("baraban"));
    }

    public static char getFirstNonRepeatingChar(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
        for (char ch : str.toCharArray()) {
            counts.put(ch, counts.containsKey(ch) ? counts.get(ch) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("Didn't find any non repeated Character");
    }

    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }

    public static char firstNonRepeatedCharacter(String word) {
        HashMap<Character, Integer> scoreboard = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char currentChar=word.charAt(i);
            if(scoreboard.containsKey(currentChar)){
                scoreboard.put(currentChar,scoreboard.get(currentChar)+1);
            }else {
                scoreboard.put(currentChar,1);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(scoreboard.get(c)==1){
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }


}
