import java.util.*;

public class vat {
    public static void main(String []args) {
    
    Scanner sc = new Scanner(System.in) ;
    
    double money = sc.nextDouble();
    sc.close();
    if( money  <= 50000.00) {
        System.out.println(money*0.05);
    }
    else{
        System.out.println(money*0.1);
        }
    }
} 