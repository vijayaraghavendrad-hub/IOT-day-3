package IOT3;
import java.util.Scanner;
public class ten_addition {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int total = 0;

	        for (int i = 1; i <= n; i++) {
	            total = total + i;
	        }

	        System.out.println("Total = " + total);

	        sc.close();
	    }
	}


