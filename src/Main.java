import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.UIManager.get;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        isPositive(intList);
        System.out.println(intList);

        isEven(intList);
        System.out.println(intList);

        isSorting(intList);
        System.out.println(intList);

        List<Integer> result = new ArrayList<>();
    }
    public static List<Integer> isPositive(List<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) <= 0) {
                list1.remove(i);
                i--;
            }
        }
        return list1;
    }
    public static List<Integer> isEven(List<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) % 2 != 0) {
                list2.remove(i);
                i--;
            }
        }
        return list2;
    }
    public static List<Integer> isSorting(List<Integer> list3) {
        Collections.sort(list3);
    //    get(list3);
        return list3;
    }
}