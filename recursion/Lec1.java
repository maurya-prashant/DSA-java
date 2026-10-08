
public class Lec1 {

    //print 1-5
    static void print(int n){
        //base condition
        if(n>5){
            return;
        }

        System.out.println(n);
        //recursove call
        print(n+1);
    }

    //fibonacci series
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){

       // print(1);

        System.out.println(fib(50));
    }
}
