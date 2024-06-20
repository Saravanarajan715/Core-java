package Program;


class BankAccount {
    private double balance; 
    // Private field for account balance

    // Private constructor to initialize the account with an initial balance
    private BankAccount(double initialBalance) {
        System.out.println("Private constructor called");
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }

    private void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        }
    }

    
    private void withdraw(double amount) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: Rs." + amount);
        }
        else {
        	System.out.println("Not sufficient balance in your account" );
        }
    }

    
    private double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000.0);
        
        // Accessing private methods within the class
        account.deposit(500.0);
        System.out.println("Current Balance: Rs." + account.getBalance());
        account.withdraw(200.0);
        System.out.println("Current Balance: Rs." + account.getBalance());
    }
}
