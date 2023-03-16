//import java.util.*;

class adv_pattern {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);

        // System.out.println(" enter the age..... ");
        // int age ;
        int n = 11;
        // age= sc.nextInt();
        // System.out.println(" The age of 'Lal JI' is: "+ age);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1 || i + j == (n - 1) / 2
                        || i - j == (n - 1) / 2 || j - i == (n - 1) / 2 || i + j == 15) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // int n=11;
        // for(int i=0; i<=n; i++){
        // for(int j=0; j<=i; j++){
        // if((i+j) == (n-1)){
        // System.out.print(" $ ");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
    }

}