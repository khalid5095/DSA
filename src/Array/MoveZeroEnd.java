package Array;

public class MoveZeroEnd {
   static void swap(int [] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        int[]nums={1,3,4,0,4,0,8,9,3};
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
        }
        for (int i: nums){
            System.out.print(i+"\t");
        }
    }
}
