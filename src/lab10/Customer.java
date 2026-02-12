
import java.util.ArrayList;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account ac) {
        acct.add(ac);
    }
    
    public Account getAccount(int index) {
        return (Account) acct.get(index);
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " has " + getNumOfAccount() + " accounts.";
    }

    public boolean equals(Customer c) {
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}