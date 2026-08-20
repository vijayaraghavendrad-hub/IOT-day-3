package IOT3;

import java.util.HashSet;

public class hashset_ex {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 20, 40};
        int target = 20;

        HashSet<Integer> set = new HashSet<>();

        for (int num : numbers) {
            set.add(num);
        }
        if (set.contains(target)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}