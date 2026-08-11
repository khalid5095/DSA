package Foundation;

public class AllDIvisor {
    static void divisors(int n){
        for (int i=1;i<=n/2;i++){
            if (n%i==0){
                System.out.print(i+"\t");
            }
        }
        System.out.print(n);
    }

    public static void main(String[] args) {
        int n=48;
        divisors(n);
    }
}
