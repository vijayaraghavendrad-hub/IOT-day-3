package IOT3;

public class optimization_ex {
	public static void main(String[] args) {

        int n = 100;
        int[] students = new int[n];
        boolean found= false;
        for (int i = 0; i < n; i++) {
            students[i] = i + 1;

            if (students[i] == 1000) {
                System.out.println("Student found: true");
                break;
            }
            else {
            	System.out.println("student found: false");
            }
        }
    }
}
