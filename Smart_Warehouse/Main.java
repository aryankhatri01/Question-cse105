package Smart_Warehouse;

public class Main {
    public static void main(String[] args) {

        ColdBox coldBox = new ColdBox(101, 250.5);

        coldBox.displayDetails();
        coldBox.adjustTemp(4);
        coldBox.showTemperature();
    }
}