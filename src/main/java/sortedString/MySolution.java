package sortedString;

import java.util.ArrayList;
import java.util.Comparator;

public class MySolution {
    public static void main(String[] args) {
        String[] strings = {"aaa", "bb", "ccccccccc", "d"};
        for (String str : getSortedArr(strings)) {
            System.out.println(str);
        }

    }

    public static String[] getSortedArr(String[] strings) {
        ArrayList<String> newArray = new ArrayList<String>();
        for (String s : strings) {
            if (s != null) {
                newArray.add(s);
            }
        }
        newArray.sort(Comparator.comparing(String::length));
        String[] sortedArray = new String[newArray.size()];
        sortedArray = newArray.toArray(sortedArray);
        return sortedArray;
    }

}
