package Ecommerce;

import java.util.Scanner;

public class Grocery {
    static Scanner sc = new Scanner(System.in);

    public static void show(Cart cart) {
        while (true) {
        	System.out.println(Colors.GREEN);
            System.out.println("\n--- GROCERY ---");
            System.out.println("1. Vegetables");
            System.out.println("2. Fruits");
            System.out.println("3. Beverages");
            System.out.println("4. Snacks");
            System.out.println("0. Back to Main Menu"+Colors.RESET);

            int ch = sc.nextInt();

            switch (ch) {
                case 1: vegetables(cart); break;
                case 2: fruits(cart); break;
                case 3: beverages(cart); break;
                case 4: snacks(cart); break;
                case 0: return;
                default: System.out.println("Invalid choice");
            }
        }
    }

    // ---------- 1. VEGETABLES ----------
    static void vegetables(Cart cart) {
        System.out.println(Colors.PURPLE + "\n---------- VEGETABLES ----------" );
        Vegetables[] v = new Vegetables[10];

        v[0]  = new Vegetables("Potato", "Local Farm", "Root", 1, 40);
        v[1]  = new Vegetables("Onion", "Local Farm", "Bulb", 1, 45);
        v[2]  = new Vegetables("Tomato", "Local Farm", "Fruit Veg",1, 35);
        v[3]  = new Vegetables("Carrot", "Organic", "Root", 1, 60);
        v[4]  = new Vegetables("Beetroot", "Organic", "Root", 1, 55);
        v[5]  = new Vegetables("Cabbage", "Fresh Farm", "Leafy", 1 , 30);
        v[6]  = new Vegetables("Cauliflower", "Fresh Farm", "Flower", 1, 45);
        v[7]  = new Vegetables("Brinjal", "Local Farm", "Fruit Veg", 1, 50);
        v[8]  = new Vegetables("Lady Finger", "Organic", "Pod", 1, 65);
        v[9]  = new Vegetables("Green Chilli", "Local Farm", "Spice Veg", 250, 20);
        Product.showProducts(v, cart);
        System.out.println(Colors.RESET);
    }

    // ---------- 2. FRUITS ----------
    static void fruits(Cart cart) {
        System.out.println(Colors.CYAN + "\n-----------FRUITS ----------");

        Fruits[] p = new Fruits[10];
        p[0] = new Fruits("Apple", "FreshFruits", "Pome", 1, 120);
        p[1] = new Fruits("Banana", "Tropical", "Berry", 1, 40);
        p[2] = new Fruits("Orange", "CitrusWorld", "Citrus", 1, 60);
        p[3] = new Fruits("Grapes", "GreenVine", "Berry", 0.5, 90);
        p[4] = new Fruits("Mango", "Alphonso", "Stone Fruit", 1, 150);
        p[5]  = new Fruits("Papaya", "FarmFresh", "Berry", 1, 45);
        p[6]  = new Fruits("Pineapple", "TropicalFarm", "Multiple Fruit", 1, 80);
        p[7]  = new Fruits("Watermelon", "FreshFarm", "Berry", 1, 30);
        p[8]  = new Fruits("Muskmelon", "GreenFields", "Berry", 1, 35);
        p[9]  = new Fruits("Guava", "OrganicFarm", "Berry", 1, 50);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }

    // ---------- 3. BEVERAGES ----------
    static void beverages(Cart cart) {
        System.out.println(Colors.GREEN + "\n---------- BEVERAGES ----------" );

        Beverages[] p = new Beverages[10];
        p[0] = new Beverages("Coke", "Coca-Cola", "Cola", true, 50);
        p[1] = new Beverages("Pepsi", "PepsiCo", "Cola", true, 45);
        p[2] = new Beverages("Orange Juice", "Tropicana", "Orange", false, 80);
        p[3] = new Beverages("Lassi", "Amul", "Sweet", false, 60);
        p[4] = new Beverages("Mineral Water", "Bisleri", "Plain", false, 20);
        p[5]  = new Beverages("Sprite", "Coca-Cola", "Lemon", true, 45);
        p[6]  = new Beverages("7 Up", "PepsiCo", "Lemon", true, 45);
        p[7]  = new Beverages("Thums Up", "Coca-Cola", "Strong Cola", true, 55);
        p[8]  = new Beverages("Frooti", "Parle Agro", "Mango", false, 35);
        p[9]  = new Beverages("Maaza", "Coca-Cola", "Mango", false, 40);
        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }

    // ---------- 4. SNACKS ----------
    static void snacks(Cart cart) {
        System.out.println(Colors.YELLOW + "\n-----------SNACKS -----------" );
        Snacks[] p = new Snacks[10];
        p[0] = new Snacks("Lays Chips", "Lays", "Chips", 100, 30);
        p[1] = new Snacks("Bingo", "Bingo", "Chips", 80, 25);
        p[2] = new Snacks("Namkeen Mix", "Haldiram", "Namkeen", 200, 50);
        p[3] = new Snacks("Oreo", "Britannia", "Cookies", 150, 60);
        p[4] = new Snacks("Pasta Snacks", "MTR", "Snacks", 100, 40);
        p[5]  = new Snacks("Kurkure", "PepsiCo", "Snacks", 90, 20);
        p[6]  = new Snacks("Good Day", "Britannia", "Cookies", 200, 35);
        p[7]  = new Snacks("Hide & Seek", "Parle", "Cookies", 150, 45);
        p[8]  = new Snacks("Aloo Bhujia", "Haldiram", "Namkeen", 150, 55);
        p[9]  = new Snacks("Roasted Peanuts", "Tata Sampann", "Dry Snacks", 200, 65);
        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }
}
