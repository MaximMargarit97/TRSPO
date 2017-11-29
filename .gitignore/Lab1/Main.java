package Lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        Calculate  Calculate  = new Calculate (a, b);
        
        System.out.println(Calculate.multiply());
        
        System.out.println(Calculate.division());
        
        System.out.println(Calculate.minus());
        
         System.out.println(Calculate.plus());
        
    }
}
