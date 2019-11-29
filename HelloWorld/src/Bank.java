public class Bank {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(int depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawFunds(int withdrawalAmount) {
        if (withdrawalAmount < this.balance) this.balance -= withdrawalAmount;
    }
}
