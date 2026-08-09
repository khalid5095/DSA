package Foundation;

public class TrailingZeros {
    static int trailingZeros(int n){
        int count=0;
        for (int i=5;i<=n;i*=5){
            count += n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=100;
        System.out.println("trailing zeros in "+n+"!: "+trailingZeros(n));
    }
}
