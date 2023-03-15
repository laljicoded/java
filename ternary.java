import java.util.*;
public class ternary {
    public static void main(String[] args) {
        int a, b;
        a=10;
        b=50;
        String res= (a>b)? "yes" : "No";
        System.out.println(res);
Scanner sc= new Scanner(System.in); 
System.out.println("enter case");
        int num= sc.nextInt(); 
        switch(num){
            case 18: System.out.println(" you can drive ");
            break;
            case 17: System.out.println("you can't drive ");
            break;
            case 90: System.out.println("you are old");
            break;
            default: System.out.println("make your dl");
            
        }
        String name= sc.next();
        System.out.println( "your name is " + name);
    }
    
}
