package removeCharInString;

public class MySolution {
    public static void main(String[] args) {
        String string = "Development";
        char removeChar = 'e';
        System.out.println(getStringWithRemoveChar(string, removeChar));
        System.out.println(useReplace(string,removeChar));
    }

    public static String remove(String word, char unwanted) {
        StringBuilder sb = new StringBuilder();
        char[] letters = word.toCharArray();
        for (char c : letters) {
            if (c != unwanted) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeRecursive(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        return removeRecursive(word.substring(0, index) + word.substring(index + 1), ch);
    }


    public static String getStringWithRemoveChar(String str, char ch) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static String useReplace(String str, char ch){
        return str.replaceAll(String.valueOf(ch),"");
    }
}
