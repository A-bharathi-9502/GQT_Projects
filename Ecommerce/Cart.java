package Ecommerce;
import java.util.*;
class Cart {
private Product[] items = new Product[200];
private int count = 0;
public void addProduct(Product p) {
	items[count++] = p;
	System.out.println(Colors.GREEN+"✔ Product added to cart"+Colors.RESET);
	}
public void showBill() {
    double total = 0;
    System.out.println(Colors.GREEN + "\n=========== BILL RECEIPT ===========");

    for (int i = 0; i < count; i++) {
        Product p = items[i];
        System.out.println(
            p.getColor() +
            p.getCategory() + " | " +
            p.getName() + " | Rs." +
            p.getPrice() +
            Colors.RESET
        );
        total += p.getPrice();
    }

    System.out.println(Colors.GREEN + "----------------------------------");
    System.out.println("TOTAL AMOUNT : Rs." + total);
    System.out.println("==================================" + Colors.RESET);
}
public boolean isEmpty() {
	return count == 0;
	}
}