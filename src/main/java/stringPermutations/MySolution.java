package stringPermutations;


public class MySolution {
    public static void main(String[] args) {
        permutation("kot");
        String str = "Dog";

    }
    //User void
    public static void permutation(String input) {
        permutation("", input);
    }//real void
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
    }
}
