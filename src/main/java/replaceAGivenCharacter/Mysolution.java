package replaceAGivenCharacter;

public class Mysolution {
    public static void main(String[] args) {
        String str ="Java is Great";
        System.out.println(useReplaceVoid(str));
        System.out.println(useFor(str));
    }
    public static String useReplaceVoid(String string){
        return string.replaceAll(" ","\\%20");
    }
    public static String useFor(String string){
        String newString = "";
        for (char c:string.toCharArray()) {
            if(c == ' '){
                newString+="%20";
            }else {
                newString+=c;
            }
        }
        return newString;
    }
}
