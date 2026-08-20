package IOT3;
import java.util.Scanner;
public class food_menu_ex {
public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("----- FOOD MENU -----");
	        System.out.println("1. Pizza");
	        System.out.println("2. Burger");
	        System.out.println("3. Sandwich");
	        System.out.println("4. Joladdh Roti");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("You selected Pizza");
	                break;

	            case 2:
	                System.out.println("You selected Burger");
	                break;

	            case 3:
	                System.out.println("You selected Sandwich");
	                break;

	            case 4:
	                System.out.println("You selected Joladhh Roti");
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }

	        sc.close();
	    }
	}

