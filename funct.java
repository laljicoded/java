// import java.util.*;

// public class funct {

//     public static int sum(int a, int b){
//         int sum= a+b;
//         return sum;
//     }
//     public static int mult(int s , int z){
//         return s*z;
//     }
//     public static void main(String[] args) {

//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter The Numbers ");

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum= sum(a, b);
//         System.out.println(" The Sum Of a and b is: " + sum);
        
// System.out.println("multiplication is: " + mult(a, b));

        
//     }
// }


import java.util.*;

class funct{
    
    // public static double average(int a, int b, int c){
    //     return (a+b+c)/3 ;
    // }

     public static void sumodd(int n){
        
        int sum=0;
        for(int i=1; i<=n; i++){
        if(i%2!=0){
             sum= sum+i;
            
        }
    }
        System.out.println("The sum of all odd number from 1 to " +n + " is " + sum);
     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        // System.out.println("Enter The Numbers ");
        // int q= sc.nextInt();
        // int w= sc.nextInt();
        // int e= sc.nextInt();

        // System.out.println("average is "+ average(q, w, e));



        // sum of all odd number from 1 to n

        int num= sc.nextInt();
        sumodd(num);


    }
}
