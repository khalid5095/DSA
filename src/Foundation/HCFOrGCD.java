package Foundation;

public class HCFOrGCD {
    //Euclid Algorithm
    static int gcd(int a,int b){
       /* while(a!=b){
            if (a<b)
                b=b-a;
            else
                a=a-b;
        }
        return a;*/
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
    //brut force approach
    static int hcf(int a, int b){
        int min=0;
        if (a<b){
            min=a;
        }else{
            min=b;
        }
        for (int i=min; i>=1;i--){
            if (a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int a=17,b=18;
       // System.out.println("Highest Common Factor of "+a+" and "+b+" is: "+hcf(a,b));
        System.out.println("Ecliud Algo:  ");
        System.out.println("Highest Common Factor of "+a+" and "+b+" is: "+gcd(a,b));
    }
}
