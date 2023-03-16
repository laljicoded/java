import java.util.*;


public class pract {
    public static void greater(int a, int b) {
        if (a > b) {
            System.out.println(a+" is greater than "+ b);

        }
        else{
            System.out.println(b+ " is greater than "+ a);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter THe Number ");
          int q= sc.nextInt();
          int w= sc.nextInt();
          greater(q, w);
    }
    
}
