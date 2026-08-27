package Foundation;

public class ToggleBit {
    /*Toggling a bit mean if a bit it 1 make it 0 and if
   a bit is 0 make it one.
   and this can be achived by using xor operator.
   which states 1^1=0 means on same it will 0.
   1^0=1 on different it will 1....
    */
    public static void main(String[] args) {
        int n=36;
        int i=5;
        int tmask=(1<<i);
        System.out.println(n ^ tmask);
    }
}
