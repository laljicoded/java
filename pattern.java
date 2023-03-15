
public class pattern {
    public static void main(String[] args) {
        // int n = 5;
        // int m = 5;

        // for (int l = 1; l <= n; l++) {
        // for (int a = 1; a <= m; a++) {
        // if (l == 1 || a == 1 || l == n || a == m) {
        // System.out.print("*");
        // } else{
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }

        // for(int i=n; i>=1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print("@");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }

        //     System.out.println();
        // }
    //         int number=1;
    //  for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(number+ " ");
    //     number++;
    // }
    //     System.out.println();

    //  }
int n=5;
 
for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
        int sum=i+j;
        if(sum%2==0){
            System.out.print(" 1 ");
        }
        else{
            System.out.print(" 0 ");
        }
    }
    System.out.println();
}


    }
}
