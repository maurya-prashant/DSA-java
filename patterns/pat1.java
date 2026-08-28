package patterns;

public class pat1 {
    
    public static void main(String[] args) {
        
        // int n=4;

        // for(int row=1; row<=n; row++){
        //     // for each roq -> n cols
        //     for(int col=1; col<=n; col++){
        //         System.out.print("*");
        //     }
        //     //move to next line
        //     System.out.println();
        // }


        //solid rectangle

        // int n=3;
        // for(int row=1; row<=n; row++){
        //     //for each row 5 col
        //     for(int col=1; col<=5; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //right angle triangle
        //rows=5, col=5

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //solid rhombus

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     //for each row spaces, star
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //inverted star

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //pyramid
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     //space
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
              // next row
        //     System.out.println();
        // }


        //inverted pyramid

        // int n=4;

        // for(int i=1; i<=n; i++){
        //     //space
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1; j<=2*n-2*i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        //hollow patterns

        // int n=4;
        // for(int i=1; i<=n; i++){
        //     //6 col
        //     for(int j=1; j<=6; j++){
        //         if(i==1 || i==n){
        //             System.out.print("*");
        //         }
        //         else{
        //             //middle rows
        //             if(j==1 || j==6){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 //middle column
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        //     //next row
        //     System.out.println();

        // }

        //hollow right angle triangle
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     //5 col
        //    if(i==1 || i==2 || i==n){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //    }
        //    else{
        //     System.out.print("*");

        //     //row-2 spaces
        //     for(int j=1; j<=(i-2); j++){
        //         System.out.print(" ");
        //     }
        //     //1*
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }
        

        //hollow triangle 
        // int n =5;
        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     if(i==1 || i==n){
        //         for(int j=1; j<=2*i-1; j++){
        //             System.out.print("*");
        //         }
        //     }
        //     else{
        //         //middle rows
        //         //1*
        //         System.out.print("*");
        //         //2r-3 space
        //         for(int j=1; j<=2*i-3; j++){
        //             System.out.print(" ");
        //         }
        //         //1*
        //         System.out.print("*");

        //     }
        //     System.out.println( );
        // }


        //solid diamond

        // int n=4;
        // for(int i=1; i<=n; i++){
        //     //space
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //       //next row
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++){
        //     if(i==1){
        //         continue;
        //     }
        //     //space
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1; j<=2*n-2*i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //optimizd code

        // int n = 4;
        // // Upper half
        // for (int i = 1; i <= n; i++) {
        //     // Spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Stars
        //     for (int j = 1; j <= 2 * i - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Lower half
        // for (int i = n - 1; i >= 1; i--) {
        //     // Spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Stars
        //     for (int j = 1; j <= 2 * i - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //hollow diamond

        //part1
        // int n =4;
        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     if(i==1){
        //         for(int j=1; j<=2*i-1; j++){
        //             System.out.print("*");
        //         }
        //     }
        //     else{
        //         //middle rows
        //         //1*
        //         System.out.print("*");
        //         //2r-3 space
        //         for(int j=1; j<=2*i-3; j++){
        //             System.out.print(" ");
        //         }
        //         //1*
        //         System.out.print("*");

        //     }
             
        //     System.out.println( );
        // }

        // //part2
        // for(int i=1; i<=(n-1); i++){
        //     //part1
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }

        //     //part2
        //     if(i==(n-1)){
        //         System.out.print("*");
        //     }
        //     else{
        //         System.out.print("*");
        //         for(int j=1; j<=2*(n-i)-3; j++){
        //             System.out.print(" ");
        //         }
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //pattern 8

        // int n=4;
       
        // for(int i=1; i<=n; i++){
        //     //part1
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //part2 (space)
        //     for(int j=1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     //part3
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //inverted symmetrical half
        // //part4
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=(n-i)+1; j++){
        //         System.out.print("*");
        //     }
        //     //part5
        //     for(int j=1; j<=2*(i-1); j++){
        //         System.out.print(" ");
        //     }
        //     //part6
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
