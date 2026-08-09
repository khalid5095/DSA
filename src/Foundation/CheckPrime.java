package Foundation;

import java.util.Scanner;

public class CheckPrime {
    static boolean checkPrime(int n){
        if (n<=1) return false;  // 0 and 1 is niether prime nor composite
      //  for (int i=2; i<=n/2; i++){
        for (int i=2; i*i<=n; i+=2){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to checck prime or not: ");
        int n=sc.nextInt();
        if (checkPrime(n)){
            System.out.println("The number "+n+" is a prime number");
        }else {
            System.out.println("The number "+n+" is not a prime number");
        }
    }
}
