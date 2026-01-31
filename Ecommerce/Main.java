package Ecommerce;
import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Cart cart = new Cart();
	public static void main(String[] args) {
		while (true) {
			System.out.println(Colors.GREEN);
			System.out.println("\n========= MAIN MENU =========");
			System.out.println("1. Electronics");
			System.out.println("2. Home Decor");
			System.out.println("3. Fashion");
			System.out.println("4. Stationery");
			System.out.println("5. Grocery");
			System.out.println("6. Checkout");
			System.out.print("Enter choice: ");
			System.out.println(Colors.RESET);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Electronics.show(cart);
				break;
			case 2:
					HomeDecor.show(cart);
					break;
			case 3:
					Fashion.show(cart);
					break;
			case 4:
					Stationery.show(cart);
					break;
			case 5:
					Grocery.show(cart);
					break;
			case 6:
					if (cart.isEmpty()) {
						System.out.println("Cart is empty");
					}
					else {
				     	cart.showBill();
						Payment.pay();
						System.exit(0);
					}
					break;
			default:
				System.out.println("Module under development");
			}
			}
		}
	}

