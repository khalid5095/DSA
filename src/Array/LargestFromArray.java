package Array;

import java.lang.instrument.ClassDefinition;

public class LargestFromArray {
    public static void main(String[] args) {
        int[] nums={12,15,2,77,8,5};
        int largest=Integer.MIN_VALUE;
        for (int i:nums){
            if (i>largest) {
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
