package Foundation;

public class Factorial {
    //1. iterative approach
    static int fact(int n){
        int res=1;
        for(int i=1; i<=n; i++){
            res *= i;
        }
        return res;
    }
    //2. recursive approach
    static int fact1(int n){
        if (n==0 || n==1) return 1;
        return n * fact1(n-1);
    }

    public static void main(String[] args) {
        int n=1;
        System.out.println("factorail using loop: "+fact(n));
        System.out.println("factorial using recursion: "+fact1(n));
    }
}
