package Ecommerce;
import java.util.Scanner;
abstract class Product {
    private String category;
    private String name;
    private String company;
    private double price;

    public Product(String category, String name, String company, double price) {
        this.category = category;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getCategory() { return category; }
    public String getName() { return name; }
    public String getCompany() { return company; }
    public double getPrice() { return price; }

    // 🎨 Product knows its own color
    public String getColor() {
        return Colors.byCategory(category);
    }

    public abstract void display();
    static void showProducts(Product[] products, Cart cart) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {
            System.out.println(
                products[i].getColor() +
                (i + 1) + ". " + products[i].getName() +
                Colors.RESET
            );
        }

        System.out.print("Select product (0-back): ");
        int p = sc.nextInt();

        if (p > 0 && p <= products.length) {
            products[p - 1].display();

            System.out.println("1. Add to Cart");
            System.out.println("2. Buy Now");

            int opt = sc.nextInt();

            if (opt == 1) {
                cart.addProduct(products[p - 1]);
            } else if (opt == 2) {
                cart.addProduct(products[p - 1]);
                cart.showBill();
                Payment.pay();
                System.exit(0);
            }
        }
    }

    }