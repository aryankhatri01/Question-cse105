package Employee_Payroll;

import java.io.*;
import java.util.ArrayList;

public class EmployeePayroll {

    public static void main(String[] args) {

        ArrayList<Employee> staff =
                new ArrayList<>();

        staff.add(
                new FullTime("John", 5000));

        staff.add(
                new Contractor("David",
                        25, 120));

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter(
                                     "payroll_report.txt"))) {

            for (Employee e : staff) {

                bw.write(
                        e.name + " : $" +
                                e.calculatePay());

                bw.newLine();
            }

            System.out.println(
                    "Payroll report created.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

