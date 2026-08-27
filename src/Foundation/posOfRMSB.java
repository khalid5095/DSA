package Foundation;

public class posOfRMSB {
    static int pos(int n){
        int mask=1;
        int position=0;
        if (n==0){
            return -1;
        }
        while ((n & mask)==0){
            mask <<= 1;
            position++;
        }
        return position+1;
    }
    static int pos1(int n){
        return (int)(Math.log10(n^(n& (n-1)))/Math.log10(2)+1);
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(pos(n));
        System.out.println(pos1(n));
    }
}
