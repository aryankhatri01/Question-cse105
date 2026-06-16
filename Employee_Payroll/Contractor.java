package Employee_Payroll;

import java.io.*;
import java.util.ArrayList;


class Contractor extends Employee {

    double hourlyRate;
    int hours;

    Contractor(String name,
               double hourlyRate,
               int hours) {

        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hours;
    }
}
