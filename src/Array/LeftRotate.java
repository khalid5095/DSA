package Array;

public class LeftRotate {
    public static void main(String[] args) {
        int [] nums={6,1,2,4,5,6,7};
        int n=nums[0];
        System.out.println(n);
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=n;
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
