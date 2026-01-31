package Ecommerce;

class MenWear extends Product {
    private String size;
    private String fabric;

    public MenWear(String name, String company, String size, String fabric, double price) {
        super("Fashion", name, company, price);
        this.size = size;
        this.fabric = fabric;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Fashion");
        System.out.println("Sub Category : Men Wear");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Size : " + size);
        System.out.println("Fabric : " + fabric);
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}

class WomenWear extends Product {
    private String size;
    private String fabric;

    public WomenWear(String name, String company, String size, String fabric, double price) {
        super("Fashion", name, company, price);
        this.size = size;
        this.fabric = fabric;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Fashion");
        System.out.println("Sub Category : Women Wear");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Size : " + size);
        System.out.println("Fabric : " + fabric);
        System.out.println("Price : Rs." + getPrice());
    }
}


class KidsWear extends Product {
    private String ageGroup;
    private String fabric;

    public KidsWear(String name, String company, String ageGroup, String fabric, double price) {
        super("Fashion", name, company, price);
        this.ageGroup = ageGroup;
        this.fabric = fabric;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Fashion");
        System.out.println("Sub Category : Kids Wear");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Age Group : " + ageGroup);
        System.out.println("Fabric : " + fabric);
        System.out.println("Price : Rs." + getPrice());
    }
}

class Footwear extends Product {
    private int size;
    private String type;

    public Footwear(String name, String company, int size, String type, double price) {
        super("Fashion", name, company, price);
        this.size = size;
        this.type = type;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Fashion");
        System.out.println("Sub Category : Footwear");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Size : " + size);
        System.out.println("Type : " + type);
        System.out.println("Price : Rs." + getPrice());
    }
}
