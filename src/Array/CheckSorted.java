package Array;

public class CheckSorted {
    public static void checkSorted(int[] nums) {
        boolean isSorted = true;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        checkSorted(nums);
    }
}