package patterns;

public class numerical_patterns {

    public static void main(String[] args) {
        
        
        //right angle triangle with increase numbers
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //pattern 13
        // int n=5;
        // int count=1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        //pattern14

        // int n=5; 
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         int a=j;
        //         int b=('A'-1);
        //         int ans= a+b;
        //         char finalans = (char)ans;
        //         System.out.print(finalans);
        //     }
        //     System.out.println();
        // }

        //pattern17
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         int a =n-j;
        //         int b='A';
        //         int ans=a+b;
        //         char finalans=(char)ans;
        //         System.out.print(finalans+ " ");
        //     }
        //     System.out.println();
        // }


        //pattern18

        // int n=4;
        // for(int i=1; i<=n; i++){
        //     //part1 spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");

        //     }
        //     //part2
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j + " ");
        //     }

        //     //part3
        //     int rowval=i;
        //     int decrowval=i-1;

        //     for(int j=1; j<=i-1; j++){
        //         System.out.print(decrowval+ " ");
        //         decrowval--;
        //     }
        //     System.out.println();
        // }


        //pattern19
        // int n=4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //part2
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
            
        // }



        //patern20
       int n=5;
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }

        for(int j=1; j<=i; j++){
            int a=j;
            int b='A'-1;
            int ans=a+b;
            char finalans=(char)ans;
            System.out.print(finalans + " ");
        }
        //part 3
        char toprint=(char)(i+'A'-2);

        for(int j=1; j<=i-1; j++){
            System.out.print(toprint+" ");
            toprint--;
        }

        System.out.println();
       }
       
    }
   


}
