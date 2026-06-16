package Daily_Sales_Log;

import java.io.*;

public class DailySalesLog {
    public static void main(String[] args) {

        double[] sales = {1200.50, 980.75, 1500.00, 1100.25,
                1350.80, 1700.40, 1450.60};

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter("weekly_sales.txt"))) {

            for (double sale : sales) {
                bw.write(String.valueOf(sale));
                bw.newLine();
            }

            System.out.println("Sales data saved successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
