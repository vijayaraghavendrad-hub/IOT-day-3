package IOT3;

import java.util.Vector;

public class vector_ex {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        int target = 20;

        Vector<Integer> vector = new Vector<>();

        for (int num : numbers) {
        	vector.add(num);
        }
        if (vector.contains(target)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}