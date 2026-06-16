package Employee_Payroll;

abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculatePay();
}