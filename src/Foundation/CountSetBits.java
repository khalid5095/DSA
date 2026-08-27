package Foundation;

public class CountSetBits {
    //brute force
    static int countSetBits(int n) {
        String bits=Integer.toBinaryString(n);
        System.out.println(bits);
        int count=0;
        for (int i = bits.length()-1; i>=0; i--) {
            if (bits.charAt(i)=='1') {
                count++;
            }
        }
        return count;
    }
    //optimized:- using kernighan's algorithm
    static int countSetBits1(int n) {
        int count=0;
        while (n!=0) {
            n=n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=32;
        System.out.println(countSetBits(n));
        System.out.println(countSetBits1(n));
    }
}
