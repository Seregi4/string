package findSubStringWithKDistChar;

import java.util.HashMap;
import java.util.Map;

public class MySolution {
    public static void main(String[] args) {
        String str = "araaci";
        int k = 2;
        System.out.println(getMaxLength(str, k));
    }

    //Идея здесь состоит в том, чтобы добавить вхождение каждого символа в A hashmap,
    // а когда размер hasmap увеличится более чем на k, удалить ненужный символ.
    private static int getMaxLength(String str, int k) {
        if (str.length() == k) {
            return k;
        } else {
            Map<Character, Integer> mapChars = new HashMap<>();
            int maxLength = 0;
            int startCounter = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                mapChars.merge(c, 1, Integer::sum);
                //atmost K different characters
                if (mapChars.size() > k) {
                    maxLength = Math.max(maxLength, i - startCounter);
                    while (mapChars.size() > k) {
                        char t = str.charAt(startCounter);
                        int count = mapChars.get(t);
                        if (count > 1) {
                            mapChars.put(t, count - 1);
                        } else {
                            mapChars.remove(t);
                        }
                        startCounter++;
                    }
                }
            }
            return maxLength;
        }
    }
}
