

public class questions{

    //print n to 1
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    //product of n to 1
    static int  product(int a){
        if(a==0){
            return 1;
        }
        return a * product(a-1);
    }

    // sum of n to 1
    static int sum(int b){
        if(b==0){
            return 0;
        }

        return b + sum(b-1);
    }

    //sum of digits   -> innput 12345 output 1+2+3+4+5 = 15
    static int sumOfDigits(int c){
        if(c==0){
            return 0;
        }
        return c%10 + sumOfDigits(c/10);
    }

    //product of digits
    static int productOfDigits(int d){
        if(d==0){
            return 1;
        }
        return d%10 * productOfDigits(d/10);
    }

    //passing numbers
    static void pass(int e){
        if(e==0){
            return;
        }
        System.out.println(e);
        pass(--e);
        
    }
    
    // revesre a number approach 1
    static int sum =0;
    static int reverse1(int f){
        
        if(f==0){
            return 0;
        }
        int rem= f%10;
        sum = sum*10 + rem;

        return reverse1(f/10);
    }

    //approach 2

    // static int reverse2(int g){
    //     int digits = (int)(Math.log10(g));
    //     return helper(g, digits);
    // }
    // private static int helper(int g, int digits){
    //     if(g%10==g){
    //         return g;
    //     }
    //     int rem = g%10;
    //     return rem.Math.pow(10, digits-1) + helper(g/10, digits-1);
    // }

    //pallindrome approach 1 with recursion
    static int sum2 = 0;
    static int pallindrome(int h) {
        if (h == 0) {
            return sum2;
        }

        int rem = h % 10;
        sum2 = sum2 * 10 + rem;

        return pallindrome(h / 10);
    }

    // approach 2 without recursion
    static boolean pallin(int n){
        int original =n;
        int reverse =0;

        while(n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n=n/10;
        }
        return original == reverse;
    }

    //count zeros
    static int count(int n){
        n = Math.abs(n); // handle negative numbers

        //base case
        if(n==0)
            return 1;
        if(n<10)
            return 0;

        //recursive call
        if(n%10 ==0){
            return 1+count(n/10);
        }
        else{
            return count(n/10);
        }

    }

    // count number of steps 
    // ex: in one step if the current number is even you have to divide it 
    // by 2. otherwise you have to subtract 1 from it

    public int numberOfSteps(int num){
        return helper(num,0);
         
    }
    private int helper(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }


    void main() {
        //fun(6);

        //System.out.println(product(5));

        //System.out.println(sum(5));

        //System.out.println(sumOfDigits(12345));

        //System.out.println(productOfDigits(12345));

        //pass(5);
        // reverse1(1234);
        // System.out.println(sum);

        //System.out.println(revesre2(1234));

        //pallindrome recursive approach

        // int n = 1234321;
        // int reverse = pallindrome(n);
        // if(n== reverse){
        //     System.out.println("number is pallindrome");
        // }
        // else{
        //     System.out.println("number is not pallidrome");
        // }

        // pallindrome normal approach
        // System.out.println(pallin(123454321));

        //System.out.println(count(10204));

        System.out.println(numberOfSteps(2));
    }
}