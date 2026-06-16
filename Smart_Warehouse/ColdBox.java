package Smart_Warehouse;

public class ColdBox extends StorageUnit implements Refrigerated {

    private int temperature;

    public ColdBox(int id, double capacity) {
        super(id, capacity);
    }

    @Override
    public void adjustTemp(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature adjusted to " + temperature + "°C");
    }

    public void showTemperature() {
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}