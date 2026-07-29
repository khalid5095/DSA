package Array;

public class CountPveNeveZeros {
    public static void main(String[] args) {
        int [] nums={1,-1,3,4,8,0,-6,-7,0};
        int zCount=0;
        int nCount=0;
        int pCount=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                zCount++;
            }else if (nums[i]<0){
                nCount++;
            }else {
                pCount++;
            }
        }
        System.out.println("Zeros: "+zCount);
        System.out.println("Ners: "+nCount);
        System.out.println("Pers: "+pCount);
    }
}
