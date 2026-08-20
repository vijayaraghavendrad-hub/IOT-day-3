import java.util.Vector;

public class VectorConstructor {

    public static void main(String[] args) {

        // Capacity = 10, increment = 10 (default)
        Vector<String> vector = new Vector<>();

        // Capacity = 5
        // Vector<String> vector = new Vector<>(5);

        // Capacity = 5, increment = 3
        // Vector<String> vector = new Vector<>(5, 3);

        // Adding 11 elements
        for (int i = 0; i < 11; i++) {
            vector.add("A");
        }

        System.out.println("No of elements in the vector: " + vector.size());
        System.out.println("Capacity of the vector: " + vector.capacity());
        System.out.println("Values stored in vector: " + vector);

        vector.trimToSize();

        System.out.println("\nAfter trimming......");

        System.out.println("No of elements in the vector: " + vector.size());
        System.out.println("Capacity of the vector: " + vector.capacity());
        System.out.println("Values stored in vector: " + vector);
    }
}