package countTheOccurrenceOfAGivenCharacter;

public class MySolution {
    public static void main(String[] args) {
        String string = "Traktor";
        char search = 'r';
        int count = 0;
        for (char c : string.toCharArray()) {
                if (search==c){
                    count++;
                }
        }
        System.out.println(count);
    }
}
