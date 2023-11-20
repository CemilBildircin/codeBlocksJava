package Constructor;

public class Food {

    String name;
    int quantity;
    double unitPrice, totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        Calculate();
    }

    void Calculate() {
        totalPrice = quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "\nItem Details" +
                "\n\tName: " + name +
                "\n\tQuantity: " + quantity +
                "\n\tUnit Price: $" + unitPrice +
                "\n\tTotal Price: $" + totalPrice;
    }
}

