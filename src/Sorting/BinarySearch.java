package Sorting;

public class BinarySearch {
    /*Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4*/
    public static int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                high=mid-1;

            }else  {
                low=mid+1;
            }
        }
        return -1;
    }
    //using recursion
    static int binarySearch(int[] nums,int target,int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]>target) {
                return binarySearch(nums,target,low,mid-1);
            }else{
                return binarySearch(nums,target,mid+1,high);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,4,6,8,9};
        int taget=1;
        System.out.println(search(nums,taget));
        System.out.println(binarySearch(nums,taget,0,nums.length-1));
    }
}
