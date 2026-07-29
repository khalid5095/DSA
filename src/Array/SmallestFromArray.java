package Array;

public class SmallestFromArray {
    public static void main(String[] args) {
        int[] nums={12,15,21,77,8,5};
        int smallest=Integer.MAX_VALUE;
        for (int i:nums){
            if (i<smallest) {
                smallest = i;
            }
        }
        System.out.println(smallest);
    }
    }
