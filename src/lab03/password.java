import java.util.* ;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "PASS2025";
        String input;
        do {
            System.out.print("Enter password: ");
            input = sc.nextLine();
            if (!input.equals(pass)) {
                System.out.println("Try again.");
            }                       
        } while (!input.equals(pass));

        System.out.println("Access granted.");
    }
}