package Array;

import java.lang.instrument.ClassDefinition;

public class LargestFromArray {
    public static void main(String[] args) {
       int [] arr={12,3,18,5,21,13};
       int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Element: "+largest);
    }
}
