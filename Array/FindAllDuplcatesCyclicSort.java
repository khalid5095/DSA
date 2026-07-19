package Backend.DSA.Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplcatesCyclicSort {
        public static void swap(int[] nums, int first, int second) {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }

        public static List<Integer> findDuplicates(int[] nums) {

            int i = 0;

            while (i < nums.length) {

                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }

            List<Integer> ans = new ArrayList<>();

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] != j + 1) {
                    ans.add(nums[j]);
                }
            }

            return ans;
        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,6,7,8,1,8,4};

            System.out.println(findDuplicates(arr));
    }
    }
