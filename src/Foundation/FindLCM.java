package Foundation;

public class FindLCM {
    //brute force
    public static int findLcm(int a,int b){
        int res=Math.max(a,b);
        while (true){
            if (res % a==0 && res % b==0){
                break;
            }
            res++;
        }
        return res;
    }
    //using lcm=a*b/gcd optimize approach
   static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if (a<b)
                b=b%a;
            else
                a=a%b;
        }
        if (a != 0){
            return a;
        }else {
            return b;
        }
    }
    public static int findLCM(int a,int b){
        return a*b/gcd(a,b);
    }

    public static void main(String[] args) {
        int a=12;
        int b=8;
        System.out.println("LCM of "+a+" and "+ b+" is : "+ findLcm(a,b));
        System.out.println("LCM of "+a+" and "+ b+" is : "+ findLCM(a,b));
    }
}
