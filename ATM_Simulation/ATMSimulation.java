package ATM_Simulation;

public class ATMSimulation {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(1000);

        account.withdraw(200);
        account.withdraw(1200);
    }
}
