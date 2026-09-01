package Foundation;

import java.util.Scanner;

public class PerfectNumber {
    // perfect number mean: sum of factors of a number excluding the number itself is equal of that number is known as perfect number.
    //eg: 6->factor of 6:1,2,3,6(sum=1+2+3=6) so 6 is perfecct number.
    static boolean isPerfect(int n) {
        if (n<=1){
            return false;
        }
        int sum = 1;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n/i){
                    sum+=n/i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 8128;
        System.out.println(isPerfect(n));
    }
}
