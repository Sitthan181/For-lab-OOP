import java.util.* ;
public class num_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price for item " + i + ": ");
            total += sc.nextInt();
        }
        System.out.println("Total = " + total);
        System.out.print("Enter amount paid: ");
        int paid = sc.nextInt();
        System.out.println("Change = " + (paid - total));
    }
}