import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        // pattern printing 
        // for(int j =n-1; j<= n; j++){
        //     for( int i=n-1; i<=j; i++){
           //         System.out.print(" ");
           // }
           //  System.out.println("*");
        // }

        // System.out.println(" ");

        /*
        to print : 

              *
            * *
          * * *
          
            Space : n-i
            star : i
         
        for(int i=1; i<=n; i++){
            for(int sp = 1; sp <= n-i; sp++)
                    System.out.print(" ");

            for(int st =1; st <= i; st++)
                System.out.print("* ");

            System.out.println();
            
        }

        Here is this is used for Diamond 

        for(int i=n; i>=1; i--){
            for(int sp = 1; sp <= n-i; sp++)
                    System.out.print(" ");

            for(int st =1; st <= i; st++)
                System.out.print("* ");

            System.out.println();
            
        }
        */

        // TO print the  pattern :

        /*

        * * * * *
        *       *
        *       *
        *       *
        * * * * *
         
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        */

        /* 
        n-> always odd
        n = 5

        1   5
         2 4
          3  
        

        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n - i + 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==i || j==n-i+1){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        */

        /* nEw pattern
        
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
         */

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
        // NOTE : For all questions Grind box approach !

        sc.close();
}
}
