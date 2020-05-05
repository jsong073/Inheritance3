import java.text.NumberFormat;
import java.util.Locale;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:         " + description + "\n" +
                "Price:               " + this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        Locale locale = new Locale("en", "US");
        return NumberFormat.getCurrencyInstance(locale).format(price);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}