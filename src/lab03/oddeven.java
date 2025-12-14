import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;
        int num = 0;

        while (num != -1) {
            System.out.print("");
            num = sc.nextInt();

            if (num == -1) break;

            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}