
public class CheckingAccount extends Account {
    private double credit;

    public CheckingAccount() {
        super(0, "");
        this.credit = 0;
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void withdraw(double a) {
        if (a > 0) {
            if ((balance - a) >= 0) {
                balance -= a;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else if ((balance - a) < 0 && (balance - a + credit) >= 0) {
                double diff = a - balance;
                balance = 0;
                credit -= diff;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else {
                System.out.println("Not enough money!");
            }
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}