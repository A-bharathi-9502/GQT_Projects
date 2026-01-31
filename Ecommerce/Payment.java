package Ecommerce;
import java.util.*;
class Payment {
static Scanner sc = new Scanner(System.in);
public static void pay() {
	System.out.println(Colors.BLUE);
	System.out.println("\n--- PAYMENT OPTIONS ---");
	System.out.println("1. Cash");
	System.out.println("2. UPI");
	System.out.println("3. Net Banking"+Colors.RESET);
	int choice = sc.nextInt();
	if (choice == 2) {
		System.out.print("Enter UPI ID: ");
		sc.next();
		} else if (choice == 3) {
			System.out.print("Enter Account Number: ");
			sc.next();
			System.out.print("Enter IFSC Code: ");
			sc.next();
			}
	System.out.println(Colors.GREEN+"✔ Payment Successful"+Colors.RESET);
}
}