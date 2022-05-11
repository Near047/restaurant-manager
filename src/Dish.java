
public class Dish {
    private final String name;
    private double price;
    private String category;
    private String description = "";
    private boolean availability = true;


    public Dish(String name, double price, String description, String category ) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
