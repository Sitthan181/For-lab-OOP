import java.util.*;

public class lab16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (-1 to stop): ");
        int n = sc.nextInt();

        if (n == -1) {
            System.out.println("No numbers were entered.");
        } else {

            int max = n;
            int min = n;

            System.out.print("Enter a number (-1 to stop): ");
            n = sc.nextInt();

            while (n != -1) {

                if (n > max) max = n;
                if (n < min) min = n;

                System.out.print("Enter a number (-1 to stop): ");
                n = sc.nextInt();
            }

            System.out.println("Maximum = " + max);
            System.out.println("Minimum = " + min);
        }
    }
}