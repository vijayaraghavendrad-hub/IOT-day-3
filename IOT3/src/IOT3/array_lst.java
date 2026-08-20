package IOT3;

import java.util.ArrayList;

public class array_lst {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Initial size of ArrayList before adding element: " + list.size());
        System.out.println("ArrayList is empty before adding value: " + list.isEmpty());
        System.out.println("Contents of ArrayList before adding value: " + list);

        list.add("C");
        list.add("A");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("R");
        list.add("A");
        list.add("NULL");

        System.out.println("Size of ArrayList after adding element: " + list.size());
        System.out.println("ArrayList is empty after adding value: " + list.isEmpty());
        System.out.println("Contents of ArrayList after adding value: " + list);

        boolean b1 = list.contains("E");
        System.out.println("Value E is present: " + b1);

        list.clear();

        boolean b2 = list.contains("R");
        System.out.println("Value R is present: " + b2);

        System.out.println("Size of ArrayList after clear: " + list.size());
        System.out.println("ArrayList is empty after clear: " + list.isEmpty());

        list.remove("H");

        System.out.println("Size of ArrayList after remove: " + list.size());
        System.out.println("ArrayList is empty after remove: " + list.isEmpty());
    }
}