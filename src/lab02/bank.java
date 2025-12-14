import java.util.*;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double sal = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String pos = sc.next();
        sc.close();
        switch (pos) {
            case "A":
                sal = sal * 1.015;
                break;
            case "B":
                sal = sal * 1.02;
                break;
            case "C":
                sal = sal * 1.015;
                break;
            case "X":
                sal = sal * 1.05;
                break;
        }
        System.out.println("Your total money in one year = " + (int) sal);
    }
}
