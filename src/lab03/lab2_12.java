import java.util.*;
public class lab2_12 {
    public static void main(String[] args) {
        String name;
        int age, work, absent;
        double weight, salary = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        name = sc.next();
        System.out.print("Please insert your age : ");
        age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        work = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        absent = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = sc.nextDouble();
        sc.close();
        if (21 <= age && age <= 30) {
            salary = (work * 300) - (absent * 50);
        } else if (31 <= age && age <= 40) {
            salary = (work * 500) - (absent * 50);
        } else if (41 <= age && age <= 50) {
            salary = (work * 1000) - (absent * 25);
        } else if (51 <= age && age <= 60) {
            salary = (work * 3000);
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        /* Bonus weight */
        if (10 <= weight && weight <= 60) {
            salary += 5000;
        } else if (61 <= weight && weight <= 90) {
            salary += 5000 - ((weight - 60) * 10);
        }
        System.out.println("Your salary and bonus is " + salary + " Baht");
    }
}
