package Product_Inventory;

class Electronics implements Discountable {

    private String name;
    private double price;

    Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void applyDiscount(double pct) {
        price = price - (price * pct / 100);
    }

    public void display() {
        System.out.println(name + " : $" + price);
    }
}
