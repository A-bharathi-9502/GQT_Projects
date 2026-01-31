package Ecommerce;
import java.util.Scanner;

public class Stationery {
    static Scanner sc = new Scanner(System.in);

    public static void show(Cart cart) {
        while (true) {
            System.out.println(Colors.BLUE + "\n--- STATIONERY ---");
            System.out.println("1. Writing Tools");
            System.out.println("2. Notebooks");
            System.out.println("3. School Supplies");
            System.out.println("4. Office Supplies");
            System.out.println("0. Back to Main Menu" + Colors.RESET);

            int ch = sc.nextInt();

            switch (ch) {
                case 1: writingTools(cart); break;
                case 2: notebooks(cart); break;
                case 3: schoolSupplies(cart); break;
                case 4: officeSupplies(cart); break;
                case 0: return;
                default: System.out.println("Invalid choice");
            }
        }
    }


    // ---------- 1. WRITING TOOLS ----------
    static void writingTools(Cart cart) {
        System.out.println(Colors.PURPLE + "\n---------- WRITING TOOLS ----------" );

        WritingTools[] p = new WritingTools[10];

        p[0] = new WritingTools("Ball Pen", "Reynolds", "Pen", "Blue", 20);
        p[1] = new WritingTools("Gel Pen", "Cello", "Pen", "Black", 30);
        p[2] = new WritingTools("Marker", "Camlin", "Marker", "Red", 50);
        p[3] = new WritingTools("Highlighter", "Faber-Castell", "Highlighter", "Yellow", 70);
        p[4] = new WritingTools("Pencil", "Nataraj", "Pencil", "Grey", 10);
        p[5] = new WritingTools("Sketch Pen", "Camel", "Sketch", "Multi", 150);
        p[6] = new WritingTools("Whiteboard Marker", "Camlin", "Marker", "Blue", 60);
        p[7] = new WritingTools("Calligraphy Pen", "Pilot", "Pen", "Black", 299);
        p[8] = new WritingTools("Fountain Pen", "Parker", "Pen", "Blue", 999);
        p[9] = new WritingTools("Crayons", "DOMS", "Crayons", "Multi", 120);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);
    }

    // ---------- 2. NOTEBOOKS ----------
    static void notebooks(Cart cart) {
        System.out.println(Colors.CYAN + "\n-----------NOTEBOOKS ----------");

        Notebooks[] p = new Notebooks[10];

        p[0] = new Notebooks("Classmate Notebook", "ITC", 200, "A4", 120);
        p[1] = new Notebooks("Long Notebook", "Navneet", 172, "Long", 90);
        p[2] = new Notebooks("Spiral Notebook", "Classmate", 300, "A4", 220);
        p[3] = new Notebooks("Drawing Book", "Camel", 100, "A3", 180);
        p[4] = new Notebooks("Rough Book", "Camlin", 150, "A4", 70);
        p[5] = new Notebooks("Exam Pad", "Classmate", 200, "A4", 150);
        p[6] = new Notebooks("Mini Notebook", "Navneet", 80, "A6", 40);
        p[7] = new Notebooks("Diary", "Paperkraft", 250, "A5", 399);
        p[8] = new Notebooks("Project Book", "Classmate", 200, "A4", 160);
        p[9] = new Notebooks("Graph Book", "Camlin", 120, "A4", 140);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);
    }

    // ---------- 3. SCHOOL SUPPLIES ----------
    static void schoolSupplies(Cart cart) {
        System.out.println(Colors.GREEN + "\n----------SCHOOL SUPPLIES ----------" );

        SchoolSupplies[] p = new SchoolSupplies[10];

        p[0] = new SchoolSupplies("School Bag", "Skybags", "Bag", "Polyester", 1999);
        p[1] = new SchoolSupplies("Lunch Box", "Milton", "Lunch Box", "Plastic", 699);
        p[2] = new SchoolSupplies("Water Bottle", "Cello", "Bottle", "Steel", 499);
        p[3] = new SchoolSupplies("Geometry Box", "Camlin", "Box", "Plastic", 250);
        p[4] = new SchoolSupplies("Compass Box", "Nataraj", "Box", "Metal", 180);
        p[5] = new SchoolSupplies("School Shoes", "Bata", "Shoes", "Leather", 1499);
        p[6] = new SchoolSupplies("Pencil Box", "DOMS", "Box", "Plastic", 120);
        p[7] = new SchoolSupplies("School ID Card", "Generic", "ID Holder", "Plastic", 80);
        p[8] = new SchoolSupplies("Color Pencils", "Faber-Castell", "Colors", "Wood", 220);
        p[9] = new SchoolSupplies("Eraser Pack", "Apsara", "Eraser", "Rubber", 60);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);
    }

    // ---------- 4. OFFICE SUPPLIES ----------
    static void officeSupplies(Cart cart) {
        System.out.println(Colors.YELLOW + "\n----------- OFFICE SUPPLIES -----------" );

        OfficeSupplies[] p = new OfficeSupplies[10];

        p[0] = new OfficeSupplies("File Folder", "Solo", "File Storage", "Plastic", 199);
        p[1] = new OfficeSupplies("Stapler", "Kangaro", "Binding", "Metal", 299);
        p[2] = new OfficeSupplies("Paper Clips", "Camlin", "Clipping", "Metal", 99);
        p[3] = new OfficeSupplies("Desk Organizer", "IKEA", "Organization", "Plastic", 499);
        p[4] = new OfficeSupplies("Calculator", "Casio", "Calculation", "Plastic", 899);
        p[5] = new OfficeSupplies("White Board", "Magna", "Writing", "Board", 1999);
        p[6] = new OfficeSupplies("Sticky Notes", "3M", "Reminder", "Paper", 150);
        p[7] = new OfficeSupplies("Punch Machine", "Kangaro", "Punching", "Metal", 349);
        p[8] = new OfficeSupplies("Printer Paper", "JK Copier", "Printing", "Paper", 399);
        p[9] = new OfficeSupplies("Clipboard", "Solo", "Writing", "Plastic", 249);

        Product.showProducts(p, cart);
        System.out.println(Colors.RESET);
    }
    
}