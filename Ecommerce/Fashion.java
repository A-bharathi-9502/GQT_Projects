package Ecommerce;

import java.util.Scanner;

public class Fashion {
    static Scanner sc = new Scanner(System.in);

    public static void show(Cart cart) {
        while (true) {
        	System.out.println(Colors.YELLOW);
            System.out.println("\n--- FASHION ---");
            System.out.println("1. Men Wear");
            System.out.println("2. Women Wear");
            System.out.println("3. Kids Wear");
            System.out.println("4. Footwear");
            System.out.println("0. Back to Main Menu");
            System.out.println(Colors.RESET);

            int ch = sc.nextInt();

            switch (ch) {
                case 1: menWear(cart); break;
                case 2: womenWear(cart); break;
                case 3: kidsWear(cart); break;
                case 4: footwear(cart); break;
                case 0: return;
                default: System.out.println("Invalid choice");
            }
        }
    }

    // ---------- MEN WEAR ----------
    static void menWear(Cart cart) {
        System.out.println(Colors.PURPLE + "\n---------- MEN WEAR ----------" );
        MenWear[] p = new MenWear[10];

        p[0] = new MenWear("Formal Shirt", "Peter England", "M", "Cotton", 1999);
        p[1] = new MenWear("Casual Shirt", "Allen Solly", "L", "Cotton", 1799);
        p[2] = new MenWear("T-Shirt", "Puma", "M", "Polyester", 1299);
        p[3] = new MenWear("Jeans", "Levis", "32", "Denim", 2999);
        p[4] = new MenWear("Track Pants", "Nike", "L", "Polyester", 1899);
        p[5] = new MenWear("Blazer", "Van Heusen", "42", "Wool", 6999);
        p[6] = new MenWear("Kurta", "Manyavar", "L", "Silk", 2499);
        p[7] = new MenWear("Shorts", "HRX", "M", "Cotton", 999);
        p[8] = new MenWear("Sweatshirt", "Adidas", "L", "Fleece", 2799);
        p[9] = new MenWear("Jacket", "Roadster", "XL", "Leather", 4999);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);
    }

    // ---------- WOMEN WEAR ----------
    static void womenWear(Cart cart) {
        System.out.println(Colors.CYAN + "\n----------- WOMEN WEAR ----------");

        WomenWear[] p = new WomenWear[10];

        p[0] = new WomenWear("Saree", "Biba", "Free", "Silk", 5999);
        p[1] = new WomenWear("Kurti", "W", "M", "Cotton", 1999);
        p[2] = new WomenWear("Top", "Zara", "S", "Polyester", 2499);
        p[3] = new WomenWear("Jeans", "Levis", "30", "Denim", 3199);
        p[4] = new WomenWear("Dress", "H&M", "M", "Georgette", 3499);
        p[5] = new WomenWear("Skirt", "Forever21", "S", "Cotton", 1999);
        p[6] = new WomenWear("Leggings", "GoColors", "M", "Cotton", 999);
        p[7] = new WomenWear("Jacket", "ONLY", "L", "Leather", 5499);
        p[8] = new WomenWear("Sweater", "Mango", "M", "Wool", 2999);
        p[9] = new WomenWear("Gown", "EthnicWear", "Free", "Net", 7999);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }

    // ---------- KIDS WEAR ----------
    static void kidsWear(Cart cart) {
        System.out.println(Colors.GREEN + "\n---------- KIDS WEAR ----------" );

        KidsWear[] p = new KidsWear[10];

        p[0] = new KidsWear("T-Shirt", "Hopscotch", "5-6 yrs", "Cotton", 799);
        p[1] = new KidsWear("Frock", "Babyhug", "3-4 yrs", "Cotton", 999);
        p[2] = new KidsWear("Jeans", "FirstCry", "6-7 yrs", "Denim", 1299);
        p[3] = new KidsWear("Jacket", "Puma", "8-9 yrs", "Polyester", 2499);
        p[4] = new KidsWear("Shorts", "Mini Klub", "4-5 yrs", "Cotton", 699);
        p[5] = new KidsWear("Kurta Set", "Manyavar Kids", "7-8 yrs", "Silk", 2999);
        p[6] = new KidsWear("Track Suit", "Nike", "6-7 yrs", "Polyester", 1999);
        p[7] = new KidsWear("Skirt", "Hopscotch", "5-6 yrs", "Net", 1199);
        p[8] = new KidsWear("Sweater", "Gini & Jony", "8-9 yrs", "Wool", 1799);
        p[9] = new KidsWear("Night Suit", "FirstCry", "4-5 yrs", "Cotton", 899);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }

    // ---------- FOOTWEAR ----------
    static void footwear(Cart cart) {
        System.out.println(Colors.YELLOW + "\n---------- FOOTWEAR -----------" );

        Footwear[] p = new Footwear[10];

        p[0] = new Footwear("Running Shoes", "Nike", 9, "Sports", 5999);
        p[1] = new Footwear("Casual Shoes", "Puma", 8, "Casual", 3999);
        p[2] = new Footwear("Formal Shoes", "Bata", 9, "Formal", 2999);
        p[3] = new Footwear("Sandals", "Sparx", 8, "Casual", 1999);
        p[4] = new Footwear("Flip Flops", "Adidas", 9, "Casual", 1499);
        p[5] = new Footwear("Boots", "Woodland", 10, "Boots", 6999);
        p[6] = new Footwear("Heels", "Metro", 7, "Party", 3499);
        p[7] = new Footwear("Loafers", "Hush Puppies", 8, "Formal", 4499);
        p[8] = new Footwear("Sneakers", "Converse", 9, "Casual", 4999);
        p[9] = new Footwear("School Shoes", "Bata", 6, "School", 1999);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }
}
