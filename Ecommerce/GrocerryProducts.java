package Ecommerce;

class Vegetables extends Product {
    private String type; 
    private double weight;

    public Vegetables(String name, String company, String type, double weight, double price) {
        super("Grocery", name, company, price);
        this.type = type;
        this.weight = weight;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Grocery");
        System.out.println("Sub Category : Vegetables");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Type : " + type);
        System.out.println("Weight : " + weight + " kg");
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}

class Fruits extends Product {
    private String type; // e.g., Citrus, Berry
    private double weight; // in kg

    public Fruits(String name, String company, String type, double weight, double price) {
        super("Grocery", name, company, price);
        this.type = type;
        this.weight = weight;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Grocery");
        System.out.println("Sub Category : Fruits");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Type : " + type);
        System.out.println("Weight : " + weight + " kg");
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}

class Beverages extends Product {
    private String flavor;
    private boolean isCarbonated;

    public Beverages(String name, String company, String flavor, boolean isCarbonated, double price) {
        super("Grocery", name, company, price);
        this.flavor = flavor;
        this.isCarbonated = isCarbonated;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Grocery");
        System.out.println("Sub Category : Beverages");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Flavor : " + flavor);
        System.out.println("Carbonated : " + (isCarbonated ? "Yes" : "No"));
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}

class Snacks extends Product {
    private String type; // Chips, Namkeen, Cookies
    private double weight; // in grams

    public Snacks(String name, String company, String type, double weight, double price) {
        super("Grocery", name, company, price);
        this.type = type;
        this.weight = weight;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Grocery");
        System.out.println("Sub Category : Snacks");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Type : " + type);
        System.out.println("Weight : " + weight + " g");
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}
