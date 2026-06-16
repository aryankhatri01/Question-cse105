package Employee_Payroll;

import java.io.*;
import java.util.ArrayList;

class FullTime extends Employee {

    double salary;

    FullTime(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double calculatePay() {
        return salary;
    }
}
