public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name) {
        this(name, 9000, "oneInput@email.com");
    }

    public VipCustomer(int creditLimit, String emailAddress) {
        this("TwoInputs", creditLimit, emailAddress);
    }

    public VipCustomer() {
        this("No Inputs", 90000, "noInputs@email.com");
    }

    public String getName() {
        return this.name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void printCustomerInfo() {
        System.out.println("Name: " + this.name + ", credit limit: " + this.creditLimit + ", emailAddress: " + this.emailAddress);
    }
}
