package Ecommerce;

import java.util.Scanner;

public class HomeDecor {
    static Scanner sc = new Scanner(System.in);

    public static void show(Cart cart) {
        while (true) {
            System.out.println(Colors.BLUE + "\n--- HOME DECOR ---");
            System.out.println("1. Wall Decor");
            System.out.println("2. Lighting");
            System.out.println("3. Furniture");
            System.out.println("4. Curtains");
            System.out.println("0. Back to Main Menu" + Colors.RESET);

            int ch = sc.nextInt();

            switch (ch) {
                case 1: wallDecor(cart); break;
                case 2: lighting(cart); break;
                case 3: furniture(cart); break;
                case 4: curtains(cart); break;
                case 0: return;
                default: System.out.println("Invalid choice");
            }
        }
    }

    // ---------- 1. WALL DECOR ----------
    static void wallDecor(Cart cart) {
        System.out.println(Colors.PURPLE + "\n---------- WALL DECOR ----------" );

        WallDecor[] p = new WallDecor[10];

        p[0] = new WallDecor("Canvas Painting", "Home Centre", "Canvas", "24x36", 2999);
        p[1] = new WallDecor("Metal Wall Art", "Urban Ladder", "Metal", "30x30", 4599);
        p[2] = new WallDecor("Wooden Frame", "IKEA", "Wood", "18x24", 1999);
        p[3] = new WallDecor("Abstract Art", "Flipkart", "Canvas", "20x30", 2499);
        p[4] = new WallDecor("Wall Clock Decor", "Ajanta", "Plastic", "12 inch", 1599);
        p[5] = new WallDecor("3D Wall Sticker", "DecorVilla", "PVC", "Large", 999);
        p[6] = new WallDecor("Mandala Art", "CraftZone", "Canvas", "24x24", 2799);
        p[7] = new WallDecor("Mirror Decor", "Pepperfry", "Glass", "20x20", 3499);
        p[8] = new WallDecor("Nature Painting", "AmazonBasics", "Canvas", "30x40", 3999);
        p[9] = new WallDecor("Vintage Art", "ArtStreet", "Wood", "24x36", 2899);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);
    }

    // ---------- 2. LIGHTING ----------
    static void lighting(Cart cart) {
        System.out.println(Colors.CYAN + "\n----------- LIGHTING ----------");

        Lighting[] p = new Lighting[10];

        p[0] = new Lighting("LED Ceiling Light", "Philips", "LED", 20, 2499);
        p[1] = new Lighting("Table Lamp", "Wipro", "LED", 10, 1999);
        p[2] = new Lighting("Wall Lamp", "Syska", "LED", 12, 1799);
        p[3] = new Lighting("Hanging Light", "IKEA", "Warm", 15, 3299);
        p[4] = new Lighting("Study Lamp", "Mi", "LED", 9, 1499);
        p[5] = new Lighting("Night Lamp", "Philips", "Warm", 5, 999);
        p[6] = new Lighting("Decor Bulb", "Havells", "Filament", 8, 899);
        p[7] = new Lighting("Floor Lamp", "Urban Ladder", "LED", 18, 4499);
        p[8] = new Lighting("Chandelier", "DecorNation", "Crystal", 40, 8999);
        p[9] = new Lighting("Outdoor Light", "Syska", "LED", 25, 2999);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }

    // ---------- 3. FURNITURE ----------
    static void furniture(Cart cart) {
        System.out.println(Colors.GREEN + "\n---------- FURNITURE ----------" );

        Furniture[] p = new Furniture[10];

        p[0] = new Furniture("Sofa Set", "Urban Ladder", "Wood", 3, 25999);
        p[1] = new Furniture("Dining Table", "IKEA", "Wood", 5, 18999);
        p[2] = new Furniture("Office Chair", "Godrej", "Metal", 2, 6999);
        p[3] = new Furniture("Coffee Table", "Pepperfry", "Glass", 2, 7999);
        p[4] = new Furniture("Bed Frame", "Wakefit", "Wood", 10, 29999);
        p[5] = new Furniture("Wardrobe", "Godrej", "Steel", 5, 34999);
        p[6] = new Furniture("Bookshelf", "IKEA", "Wood", 3, 5999);
        p[7] = new Furniture("TV Unit", "Urban Ladder", "Wood", 3, 12999);
        p[8] = new Furniture("Shoe Rack", "Flipkart", "Plastic", 1, 2499);
        p[9] = new Furniture("Recliner Chair", "Durian", "Leather", 3, 45999);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }

    // ---------- 4. CURTAINS ----------
    static void curtains(Cart cart) {
        System.out.println(Colors.YELLOW + "\n---------- CURTAINS -----------" );

        Curtains[] p = new Curtains[10];

        p[0] = new Curtains("Window Curtains", "Bombay Dyeing", "Cotton", "Blue", 1999);
        p[1] = new Curtains("Door Curtains", "D'Decor", "Polyester", "Brown", 2499);
        p[2] = new Curtains("Blackout Curtains", "IKEA", "Polyester", "Grey", 2999);
        p[3] = new Curtains("Sheer Curtains", "AmazonBasics", "Net", "White", 1799);
        p[4] = new Curtains("Printed Curtains", "Flipkart", "Cotton", "Floral", 2199);
        p[5] = new Curtains("Velvet Curtains", "D'Decor", "Velvet", "Maroon", 3999);
        p[6] = new Curtains("Kids Curtains", "Home Centre", "Cotton", "Yellow", 1899);
        p[7] = new Curtains("Sliding Door Curtains", "IKEA", "Polyester", "Beige", 2699);
        p[8] = new Curtains("Luxury Curtains", "Urban Ladder", "Silk", "Cream", 4999);
        p[9] = new Curtains("Office Curtains", "Godrej", "Polyester", "Grey", 2899);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);

    }

    // ---------- COMMON DISPLAY ----------
    
}
