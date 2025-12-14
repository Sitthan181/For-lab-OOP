import java.util.*;
public class grade {
    public static void main(String[] args) {
        int n,score,ex = 0, g = 0, f = 0, p = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        
        n = sc.nextInt();
        
        for (int i = 1;i <= n;i++){
            System.out.print("Enter score for student "+ i +": ");
            score = sc.nextInt();
            if (score >= 80){
                System.out.println("Excellent");
                ex +=1;
            }else if(score >= 60){
                System.out.println("Good");
                g+=1;
            }else if(score >= 50){
                System.out.println("Fair");
                f+=1;
            }else{
                System.out.println("Poor");
                p+=1;
            }
        }
        System.out.println("Summary:");
        System.out.println("Excellent: " + ex);
        System.out.println("Good: " + g);
        System.out.println("Fair: " + f);
        System.out.println("Poor: " + p);
    }
}