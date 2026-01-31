package Ecommerce;

class WallDecor extends Product {
    private String material;
    private String size;

    public WallDecor(String name, String company, String material, String size, double price) {
        super("Home Decor", name, company, price);
        this.material = material;
        this.size = size;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : " + getCategory());
        System.out.println("Sub Category : Wall Decor");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Material : " + material);
        System.out.println("Size : " + size);
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}

class Lighting extends Product {
    private String type;
    private int watts;

    public Lighting(String name, String company, String type, int watts, double price) {
        super("Home Decor", name, company, price);
        this.type = type;
        this.watts = watts;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Home Decor");
        System.out.println("Sub Category : Lighting");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Light Type : " + type);
        System.out.println("Wattage : " + watts + "W");
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}
class Furniture extends Product {
    private String material;
    private int warranty;

    public Furniture(String name, String company, String material, int warranty, double price) {
        super("Home Decor", name, company, price);
        this.material = material;
        this.warranty = warranty;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Home Decor");
        System.out.println("Sub Category : Furniture");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Material : " + material);
        System.out.println("Warranty : " + warranty + " years");
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}
class Curtains extends Product {
    private String fabric;
    private String color;

    public Curtains(String name, String company, String fabric, String color, double price) {
        super("Home Decor", name, company, price);
        this.fabric = fabric;
        this.color = color;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Home Decor");
        System.out.println("Sub Category : Curtains");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Fabric : " + fabric);
        System.out.println("Color : " + color);
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}

