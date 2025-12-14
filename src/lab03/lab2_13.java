import java.util.*;
public class lab2_13 {
    public static void main(String[] args) {
        double gpa, income;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        gpa = sc.nextDouble();
        System.out.print("Enter family income: ");
        income = sc.nextDouble();
        sc.close();
        if (gpa >= 3.5) {
            if (income <= 15000) {
                System.out.print("You are eligible for the scholarship.");
            } else {
                System.out.print("You are not eligible for the scholarship.");
            }
        } else {
            System.out.print("You are not eligible for the scholarship.");
        }
    }
}
