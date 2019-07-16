package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> accs = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount account = accs.get(indexNumber);
        accs.remove((int) indexNumber);
        return account;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.accs.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accs.contains(bankAccount);
//        throw new UnsupportedOperationException("Method not yet implemented");
    }
}
