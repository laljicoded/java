import java.util.*;
public class enhancedforl {
    public static void main(String[] args) {
        int num[][]={
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };

        for(int a[]:num){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println(num[1].length);
        String name="Ritikesh singh"; 
        System.out.println(name.length());
        int arr[]={2,3,4,5,6,7};
        System.out.println(arr[5]);
        System.out.println(arr[arr.length-1]);

        int lal[]={3,5,8};
        System.out.println(lal[1]);
        lal[1]=10;
        System.out.println(lal[1]);


        // .................new prog................................
        // .....................Take input in array........................................


        Scanner sc= new Scanner(System.in);
        int size;

        System.out.println("Enter the size of array: ");
        size=sc.nextInt();
        System.out.println("The size of array is: "+ size);
        int numbers[]= new int[size];

        System.out.println("Enter the numbers: ");

        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println(" Output :");
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);


        }

        // /Searching in arrray.................Linear Search...........

        System.out.println("Find a single number: ");
        int a = sc.nextInt();

        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==a){
                System.out.println("a found at index no:" + i);
            }
        }


        //  .............2d array input..................


        int size1,size2;

        System.out.println("Enter The size of size1: ");
        size1= sc.nextInt();
        System.out.println("The size of size1 is: "+size1);
        System.out.println("Enter the size of size2: ");
        size2= sc.nextInt();
        System.out.println("The size of size2 is: " +size2);
        int second[][]= new int[size1][size2];

        System.out.println("Enter the arrays: ");

        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                second[i][j]=sc.nextInt();
            }
        }

        System.out.println("output is: ");

        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                System.out.print(second[i][j]+" ");
            }
            System.out.println();
        }


        // 2d array linear search.........


         
        System.out.println("Enter the searching number: ");
        int r=sc.nextInt();
        for(int i=0; i<size1; i++)

        {
         for(int j=0; j<size2; j++){
            if(second[i][j]==r){
                System.out.println(" index numbe of r is : ("+ i+","+ j + ")" );
            }
         }
        }



    }


    
}
