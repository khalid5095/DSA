package Array;

import java.util.Arrays;

public class ReverseAnArray {
    //reverse using another aray
    public static void reverse(int[] nums,int[]rev){
        for (int i=0;i<nums.length;i++){
        rev[i]=nums[nums.length-1-i];
    }
        System.out.println("Original Array: "+Arrays.toString(nums));
        System.out.println("Reversed Array: "+Arrays.toString(rev));
}
    // reverse and array without using another loop
    public static void reverse2(int[] nums){
        int start=0;
        int end=nums.length-1;
        /*for (int s = 0, e = nums.length - 1; s < e; s++, e--){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
        }*/
        //same works as upper for loop
        while (start<end){
          //  FindAllDuplcatesCyclicSort.swap(nums, start, end);
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: "+Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7,8,9};
        int [] rev=new int[nums.length];
        reverse(nums,rev);
        reverse2(nums);
}
}