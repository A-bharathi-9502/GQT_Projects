package Ecommerce;
class Mobile extends Product {
private int ram;
private int storage;


public Mobile(String name, String company, int ram, int storage, double price) {
super("Electronics", name, company, price);
this.ram = ram;
this.storage = storage;
}


public void display() {
    System.out.println(Colors.byCategory(getCategory()));

    System.out.println("Category : " + getCategory());
    System.out.println("Company  : " + getCompany());
    System.out.println("Model    : " + getName());
    System.out.println("RAM      : " + ram + " GB");
    System.out.println("Storage  : " + storage + " GB");
    System.out.println("Price    : Rs." + getPrice());

    System.out.println(Colors.RESET);
}}