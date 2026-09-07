package Sorting;


import java.util.Arrays;

public class SelectionSort {
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min]>nums[j])
                    min=j;
            }
            swap(nums,min,i);
        }
    }
    static void selectionSort1(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {

            int max = 0;

            for (int j = 1; j <= i; j++) {

                if (nums[max] < nums[j])
                    max = j;
            }

            swap(nums, max, i);
        }
    }

    public static void main(String[] args) {
        int [] nums={12,4,6,1,2,7};
        //selectionSort(nums);
        selectionSort1(nums);
        System.out.println(Arrays.toString(nums));
    }
}
