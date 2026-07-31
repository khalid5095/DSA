package Array;

public class RightRotate {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6};
        int last=nums[nums.length-1];
        for (int i= nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=last;
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
