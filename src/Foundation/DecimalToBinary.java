package Foundation;

public class DecimalToBinary {
    static int bTod(String n){
        int res=0;
        int power2=1;
        if(n=="0"){
            return 0;
        }
        for(int i=n.length()-1;i>=0;i--){
            if (n.charAt(i)=='1'){
                res+=power2;
            }
            power2*=2;
        }
        return res;
    }
    static String dTob(int n){
        String b="";
        if (n==0){
            return "0";
        }
        while(n>=1){
            int x=n%2;
            n=n/2;
            b=x+b;
        }
        return b;
    }

    public static void main(String[] args) {
        //decimal to binary;
        int d=0;
        String b = dTob(d);
        System.out.println(b);
        // binary to decimal
        System.out.println(bTod(b));
        System.out.println(5<<2);

    }
}
