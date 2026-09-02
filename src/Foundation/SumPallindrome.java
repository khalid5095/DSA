package Foundation;

public class SumPallindrome {
  static   boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        while(n !=0){
            int digit=n%10;
            sum += digit;
            n=n/10;
        }
        String a=Integer.toString(sum);
        StringBuilder sb=new StringBuilder(a);
        String reverse=sb.reverse().toString();
        if(a.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDigitSumPalindrome(57));    }
}
