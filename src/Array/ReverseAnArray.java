package Array;

import java.util.Arrays;

public class ReverseAnArray {
    //reverse array using another array
    static void reverseArray(int [] arr,int [] reverse){
        int j=0;
        for (int i=arr.length-1; i>=0; i--){
            reverse[j]=arr[i];
            j++;
        }
    }
    // Reverse array without using another array
    static void reverse(int [] arr){
        int r=arr.length-1;
        int temp;
        for (int i = 0; i < r; i++) {
            temp=arr[r];
            arr[r]=arr[i];
            arr[i]=temp;
            r--;
    }
        }
    public static void main(String[] args) {
        int [] arr={12,3,5,7,9,18};
//        int [] reverse=new int[arr.length];
//        reverseArray(arr,reverse);
      System.out.println("Orignal Array: "+Arrays.toString(arr));
//        System.out.println("Reverse Array: "+Arrays.toString(reverse));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
