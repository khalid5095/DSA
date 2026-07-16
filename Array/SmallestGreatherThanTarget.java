package Backend.DSA.Array;

public class SmallestGreatherThanTarget {
    public static int smallestGreater(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;

            if (target<nums[mid]) {
                ans=nums[mid];
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums={2,4,5,7,9,13,18};
        int target=9;
        System.out.println(smallestGreater(nums,target));
    }
}
