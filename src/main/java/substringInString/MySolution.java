package substringInString;

public class MySolution {
    public static void main(String[] args) {
        String string = "characters";
        String subString = "ara";
        int indexSub = string.indexOf(subString);
        System.out.println(searchSubString(indexSub));
    }
   public static int searchSubString(int index){
        if (index==-1){
            return -1;
        }else
            return index;
   }

}
