package Foundation;

public class CountDigitInNum {
    static int countDigits(int n){
        int count=0;
        if (n==0){
            return 1;
        }
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    static int countDigit2(int n){
        int count=0;
        if (n==0){
            return 1;
        }else {
            count=(int)Math.floor(Math.log10(n)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int n=123456;
        System.out.println(countDigits(n));
        System.out.println(countDigit2(n));
    }
}
