package Foundation;

public class ReverseInteger {
    static int reverse(int n) {
        int res = 0;
        int sign=n<0?-1:1;
        n = Math.abs(n);
        while (n != 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res * sign;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
