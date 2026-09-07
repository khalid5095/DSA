package Sorting;

public class BubbleSort {
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    swap(nums, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {4,6,5,1,3};
        bubbleSort(nums);
        for(int i : nums){
            System.out.print(i+"\t");
        }
    }
}
