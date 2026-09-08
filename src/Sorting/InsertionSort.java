package Sorting;

import java.util.Arrays;

public class InsertionSort {
    //using recursion
    static void insertionSort1(int[] arr,int n) {

            if (n<=0){
                return;
            }
         insertionSort1(arr,n-1);
            int key = arr[n-1];
            int j = n-2;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
    }
    static int[] insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={5,4,3,1,2};
        insertionSort1(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
