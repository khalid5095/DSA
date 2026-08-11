package LeetCode;

public class Pallindrome_9 {
    //optimize
    static boolean checkPallindrome1(int num) {
        if (num<0 || (num%10==0 && num!=0)) {
            return false;
        }
        int rev=0;
        while (num>rev){
            rev=rev*10+num%10;
            num=num/10;
        }
        return num==rev || num==rev/10;
    }
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    static boolean checkPallindrome(int num) {
       if (num<0){
           return false;
       }
       if (num==reverse(num))
           return true;
       return false;
    }

    public static void main(String[] args) {
        int num=12112;
        System.out.println(checkPallindrome(num));
        System.out.println(checkPallindrome1(num));
    }
}
