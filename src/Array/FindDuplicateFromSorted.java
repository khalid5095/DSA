package Array;

public class FindDuplicateFromSorted {
    public static void main(String[] args) {
        int[]nums={1,2,2,3,4,4,4,5,6,6,6,8,9,9};
       /* for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                System.out.print(nums[i]+"\t");
            }
        }*/
        // only print once a number
        for (int i=1; i<nums.length;i++){
            if (nums[i]==nums[i-1]) {
                System.out.print(nums[i] + "\t");

                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
            }
    }
}
