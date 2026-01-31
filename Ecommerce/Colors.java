package Ecommerce;
public class Colors {
    public static final String RESET = "\u001B[0m";

    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // ⭐ CATEGORY → COLOR MAPPING
    public static String byCategory(String category) {
        switch (category) {
            case "Electronics": return CYAN;
            case "Fashion": return PURPLE;
            case "Grocery": return GREEN;
            case "Home Decor": return BLUE;
            case "Stationery": return YELLOW;
            default: return RESET;
        }
    }
}
