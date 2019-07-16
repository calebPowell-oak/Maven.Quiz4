package rocks.zipcode.quiz4.objectorientation.account;

import com.sun.corba.se.impl.ior.WireObjectKeyTemplate;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {

    private BankAccount bankAccount = new BankAccount();
    private Double expectedHourlyWage;
    private Double expectedHoursWorked;
    private Double expectedBalance;
    private Double expectedBankAccountBalance;

    public Employee() {
        this(35.0, 0.0, 0.0, 0.0);
    }

    public Employee(BankAccount bankAccount) {
    }

    public Employee(Double expectedHourlyWage, Double expectedHoursWorked, Double expectedBalance, Double expectedBankAccountBalance) {
        this.expectedHourlyWage = expectedHourlyWage;
        this.expectedHoursWorked = expectedHoursWorked;
        this.expectedBalance = expectedBalance;
        this.expectedBankAccountBalance = expectedBankAccountBalance;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {

    }

    @Override
    public Double getHoursWorked() {
        return this.expectedHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.expectedHourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return null;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

    }

    @Override
    public Double getBalance() {
        return expectedBalance;
    }
}
