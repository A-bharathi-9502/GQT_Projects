package Ecommerce;
import java.util.*;
class Electronics {

    static Scanner sc = new Scanner(System.in);

    public static void show(Cart cart) {
        while (true) {
            System.out.println(Colors.BLUE + "\n--- ELECTRONICS SUB-CATEGORIES ---");
            System.out.println("1. Mobiles");
            System.out.println("2. Laptops");
            System.out.println("3. Headphones");
            System.out.println("4. Power Banks");
            System.out.println("0. Back to Main Menu" + Colors.RESET);

            int ch = sc.nextInt();

            switch (ch) {
                case 1: mobiles(cart); break;
                case 2: laptops(cart); break;
                case 3: headphones(cart); break;
                case 4: powerBanks(cart); break;
                case 0: return;
                default: System.out.println("Invalid choice");
            }
        }
    }

    // -------- Mobiles --------
    static void mobiles(Cart cart) {
        System.out.println(Colors.PURPLE + "\n--- MOBILES ---" );
        Mobile[] mobiles = new Mobile[10];
        mobiles[0] = new Mobile("Samsung S23", "Samsung", 8, 256, 74999);
        mobiles[1] = new Mobile("Samsung S24", "Samsung", 12, 256, 84999);
        mobiles[2] = new Mobile("iPhone 14", "Apple", 6, 128, 69999);
        mobiles[3] = new Mobile("iPhone 15", "Apple", 6, 256, 79999);
        mobiles[4] = new Mobile("OnePlus 11", "OnePlus", 8, 256, 61999);
        mobiles[5] = new Mobile("Vivo X90", "Vivo", 12, 256, 59999);
        mobiles[6] = new Mobile("Realme GT", "Realme", 8, 128, 34999);
        mobiles[7] = new Mobile("Redmi Note 13", "Redmi", 6, 128, 17999);
        mobiles[8] = new Mobile("Nothing Phone 2", "Nothing", 12, 256, 44999);
        mobiles[9] = new Mobile("IQOO Neo 7", "IQOO", 8, 128, 29999);

        showProducts(mobiles, cart);
        System.out.println(Colors.RESET);

    }

    // -------- Laptops --------
    static void laptops(Cart cart) {
        System.out.println(Colors.CYAN + "\n--- LAPTOPS ---");
        Mobile[] laptops = new Mobile[10];
        laptops[0] = new Mobile("Dell Inspiron", "Dell", 8, 512, 55999);
        laptops[1] = new Mobile("HP Pavilion", "HP", 16, 512, 68999);
        laptops[2] = new Mobile("Lenovo IdeaPad", "Lenovo", 8, 512, 48999);
        laptops[3] = new Mobile("Asus VivoBook", "Asus", 16, 1024, 74999);
        laptops[4] = new Mobile("MacBook Air", "Apple", 8, 256, 99999);
        laptops[5] = new Mobile("Acer Aspire", "Acer", 8, 512, 46999);
        laptops[6] = new Mobile("MSI Modern", "MSI", 16, 512, 69999);
        laptops[7] = new Mobile("Samsung Galaxy Book", "Samsung", 8, 512, 63999);
        laptops[8] = new Mobile("Honor MagicBook", "Honor", 16, 512, 58999);
        laptops[9] = new Mobile("LG Gram", "LG", 16, 1024, 129999);

        showProducts(laptops, cart);
        System.out.println(Colors.RESET);

    }

    // -------- Headphones --------
    static void headphones(Cart cart) {
        System.out.println(Colors.GREEN + "\n--- HEADPHONES ---" );
        Mobile[] headphones = new Mobile[10];
        headphones[0] = new Mobile("Sony WH-1000XM5", "Sony", 0, 0, 29999);
        headphones[1] = new Mobile("Bose QC45", "Bose", 0, 0, 27999);
        headphones[2] = new Mobile("JBL Tune 760", "JBL", 0, 0, 8999);
        headphones[3] = new Mobile("Boat Rockerz", "Boat", 0, 0, 2999);
        headphones[4] = new Mobile("Sennheiser 450BT", "Sennheiser", 0, 0, 19999);
        headphones[5] = new Mobile("Skullcandy Crusher", "Skullcandy", 0, 0, 15999);
        headphones[6] = new Mobile("Beats Studio", "Beats", 0, 0, 24999);
        headphones[7] = new Mobile("AKG N700", "AKG", 0, 0, 22999);
        headphones[8] = new Mobile("Realme Buds Wireless", "Realme", 0, 0, 1999);
        headphones[9] = new Mobile("OnePlus Bullets", "OnePlus", 0, 0, 2499);

        showProducts(headphones, cart);
        System.out.println(Colors.RESET);

    }

    // -------- Power Banks --------
    static void powerBanks(Cart cart) {
        System.out.println(Colors.YELLOW + "\n--- POWER BANKS ---" );

        Mobile[] powerBanks = new Mobile[10];
        powerBanks[0] = new Mobile("Mi 10000mAh", "Mi", 0, 0, 1299);
        powerBanks[1] = new Mobile("Realme 20000mAh", "Realme", 0, 0, 1999);
        powerBanks[2] = new Mobile("Ambrane 10000mAh", "Ambrane", 0, 0, 999);
        powerBanks[3] = new Mobile("Syska 10000mAh", "Syska", 0, 0, 899);
        powerBanks[4] = new Mobile("OnePlus 10000mAh", "OnePlus", 0, 0, 1599);
        powerBanks[5] = new Mobile("Samsung 20000mAh", "Samsung", 0, 0, 2499);
        powerBanks[6] = new Mobile("Boat EnergyShroom", "Boat", 0, 0, 1499);
        powerBanks[7] = new Mobile("URBN 10000mAh", "URBN", 0, 0, 1199);
        powerBanks[8] = new Mobile("pTron Dynamo", "pTron", 0, 0, 999);
        powerBanks[9] = new Mobile("Anker PowerCore", "Anker", 0, 0, 2999);

        showProducts(powerBanks, cart);
        System.out.println(Colors.RESET);

    }
    // -------- Common Method --------
    static void showProducts(Mobile[] products, Cart cart) {
        for (int i = 0; i < products.length; i++) {
        	
            System.out.println((i + 1) + ". " + products[i].getName());
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
