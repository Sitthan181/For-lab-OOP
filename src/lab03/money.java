import java.util.*;
public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (sum < 1000) {
            System.out.print("Enter deposit amount: ");
            int d = sc.nextInt();
            sum += d;
            count++;
        }

        System.out.println("Target reached!");
        System.out.println("Total amount saved = " + sum);
        System.out.println("Number of deposits = " + count);
    }
}