package Smart_Warehouse;

public abstract class StorageUnit {
    protected int id;
    protected double capacity;

    public StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public void displayDetails() {
        System.out.println("Storage ID: " + id);
        System.out.println("Capacity: " + capacity + " cubic meters");
    }
}