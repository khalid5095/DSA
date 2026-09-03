package Foundation;

public class ArmStronNum {
    static boolean isArmStrong(int n){
        int dup=n;
        int digits=String.valueOf(n).length();
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum += (int)Math.pow(digit,digits);
            n=n/10;
        }
        return sum==dup;
    }

    public static void main(String[] args) {
        int n=153;
        System.out.println(isArmStrong(n));
    }
}
