package Backend.DSA.Array;

public class BinarySearch {
    /*Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4*/
    public static int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (target>nums[mid]) {
                low=mid+1;
            } else if (target<nums[mid]) {
                high=mid-1;
            }else  {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,4,6,8,9};
        int taget=9;
        System.out.println(search(nums,taget));
    }
}
