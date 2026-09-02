package Foundation;

public class SumOfCube {
    static int sumCube(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++){
            sum += (int)Math.pow(i,3);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(sumCube(n));
    }
}
