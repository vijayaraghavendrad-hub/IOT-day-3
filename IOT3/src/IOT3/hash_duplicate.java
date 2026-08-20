package IOT3;

import java.util.HashSet;

public class hash_duplicate {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 20, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int number : numbers) {

            if (set.contains(number)) {
                System.out.println("Duplicate: " + number);
            } else {
                set.add(number);
            }
        }
    }
}