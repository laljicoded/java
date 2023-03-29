// public class arr{
//     public static void main(String[] args) {
//         int n=9;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+ " ");
//             }
//             System.out.println();
//         }
       
//     }
// }



public class arr{   
    public static void main(String[] args) {
        int num [] []={
            {1,4,5,6,7,8,9},
            {3,4,5,10,4,7,9}
        };
       
       
        for(int i=0; i<2; i++){
            for(int j=0; j<=6;j++){
                System.out.print( num[i][j]+" ");
            }
        System.out.println();
            
        }



    }

}