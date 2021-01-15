public class Product {

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    private String name;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public Product(String name) {
        this.name = name;
        this.quantity = 1;
    }

}