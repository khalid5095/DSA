package Foundation;

public class NumberOfPowOfTwo {
    static void numPowTwo(int n) {
        String bits = Integer.toBinaryString(n);
        int count = 0;
        if(!(n%2==0)){
            System.out.println("The number is not a power of two");
            return;
        }
        for (int i = bits.length() - 1; i >= 0; i--) {
            if (bits.charAt(i) == '1') {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("yess the number is power of two");
        }else  {
            System.out.println("this number is not power of two");
        }
    }
    static void numPowTwo1(int n) {
        if (n<=0) {
            System.out.println("not valid number");
        }
        else if((n & (n-1))==0){
            System.out.println("The number is a power of two");
        }else {
            System.out.println("not valid number");
        }
    }

    public static void main(String[] args) {
        int n = 0;
        numPowTwo(n);
        numPowTwo1(n);
    }
}