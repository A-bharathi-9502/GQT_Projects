package Ecommerce;

class WritingTools extends Product {
    private String type;
    private String color;

    public WritingTools(String name, String company, String type, String color, double price) {
        super("Stationery", name, company, price);
        this.type = type;
        this.color = color;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Stationery");
        System.out.println("Sub Category : Writing Tools");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Type : " + type);
        System.out.println("Color : " + color);
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}
class Notebooks extends Product {
    private int pages;
    private String size;

    public Notebooks(String name, String company, int pages, String size, double price) {
        super("Stationery", name, company, price);
        this.pages = pages;
        this.size = size;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Stationery");
        System.out.println("Sub Category : Notebooks");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Pages : " + pages);
        System.out.println("Size : " + size);
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}
class SchoolSupplies extends Product {
    private String itemType;
    private String material;

    public SchoolSupplies(String name, String company, String itemType, String material, double price) {
        super("Stationery", name, company, price);
        this.itemType = itemType;
        this.material = material;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Stationery");
        System.out.println("Sub Category : School Supplies");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Item Type : " + itemType);
        System.out.println("Material : " + material);
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}
class OfficeSupplies extends Product {
    private String use;
    private String material;

    public OfficeSupplies(String name, String company, String use, String material, double price) {
        super("Stationery", name, company, price);
        this.use = use;
        this.material = material;
    }

    public void display() {
        System.out.println(Colors.byCategory(getCategory()));

        System.out.println("Category : Stationery");
        System.out.println("Sub Category : Office Supplies");
        System.out.println("Brand : " + getCompany());
        System.out.println("Product : " + getName());
        System.out.println("Use : " + use);
        System.out.println("Material : " + material);
        System.out.println("Price : Rs." + getPrice());
        System.out.println(Colors.RESET);
    }
}
