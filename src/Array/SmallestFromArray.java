package Array;

public class SmallestFromArray {
    public static void main(String[] args) {
        int[] nums={12,15,21,77,8,5,0,-1};
        int smallest=Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest Element: "+smallest);
    }
    }
