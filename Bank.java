import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to the bank: " + account.getAccountNumber());
    }

    // Method to remove an account from the bank
    public void removeAccount(Account account) {
        if (accounts.remove(account)) {
            System.out.println("Account removed from the bank: " + account.getAccountNumber());
        } else {
            System.out.println("Account not found in the bank.");
        }
    }

    // Method to deposit money into an account
    public void depositMoney(Account account, double amount) {
        if (accounts.contains(account)) {
            account.deposit(amount);
            System.out.println("Deposit of " + amount + " made to account: " + account.getAccountNumber());
        } else {
            System.out.println("Account not found in the bank.");
        }
    }

    // Method to withdraw money from an account
    public void withdrawMoney(Account account, double amount) {
        if (accounts.contains(account)) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrawal of " + amount + " made from account: " + account.getAccountNumber());
            } else {
                System.out.println("Insufficient funds in account: " + account.getAccountNumber());
            }
        } else {
            System.out.println("Account not found in the bank.");
        }
    }

    public static class Account {
        private static int nextAccountNumber = 1000;
        private int accountNumber;
        private String customerName;
        private double balance;

        // Constructor
        public Account(String customerName, double balance) {
            this.accountNumber = nextAccountNumber++;
            this.customerName = customerName;
            this.balance = balance;
        }

        // Getter for account number
        public int getAccountNumber() {
            return accountNumber;
        }

        // Getter for customer name
        public String getCustomerName() {
            return customerName;
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }

        // Method to deposit money into the account
        public void deposit(double amount) {
            balance += amount;
        }

        // Method to withdraw money from the account
        public boolean withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        // Create accounts and add them to the bank
        Bank.Account account1 = new Bank.Account("John Doe", 1000.0);
        Bank.Account account2 = new Bank.Account("Jane Smith", 2000.0);
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Deposit and withdraw money from accounts
        bank.depositMoney(account1, 500.0);
        bank.withdrawMoney(account2, 1000.0);

        // Display account details
        System.out.println("Account Details:");
        System.out.println("Account Number: " + account1.getAccountNumber() + ", Customer Name: " + account1.getCustomerName() + ", Balance: " + account1.getBalance());
        System.out.println("Account Number: " + account2.getAccountNumber() + ", Customer Name: " + account2.getCustomerName() + ", Balance: " + account2.getBalance());
    }
}
