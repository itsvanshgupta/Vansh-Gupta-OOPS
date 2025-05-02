class Customer {
    private double balance;

    // Method to add balance (double)
    public void addBalance(double amount) {
        balance += amount;
        System.out.println("Added: " + amount + ", New Balance: " + balance);
    }

    // Overloaded method to add balance (int)
    public void addBalance(int amount) {
        balance += amount;
        System.out.println("Added: " + amount + ", New Balance: " + balance);
    }

    // Protected method to deduct balance
    protected void deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Deducted: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Package-private method to show balance
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.addBalance(1000);
        customer.addBalance(500.50);
        customer.showBalance();
        customer.deductBalance(300);
        customer.showBalance();
    }
}
