package Foundation;

public class BitOffMask {
    public static void main(String[] args) {
        int n=36;//(00100100)
        int i=2; // i want to turn off the 3rd bit of binary
        int offMask=~(1<<i); //this will become(11111011)
        System.out.println(n & offMask);//(00100100)&(11111011)=(00100000=32)
    }
}
