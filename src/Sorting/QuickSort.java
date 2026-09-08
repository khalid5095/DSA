package Sorting;

public class QuickSort {
    public static void main(String [] args){
    int [] arr={8,2,4,7,1,3,9,6,5};
    quickSort(arr,0,arr.length-1);
    for(int i : arr){
        System.out.print(i+"\t");
    }
    }

    private static void quickSort(int[] arr, int s, int e) {
        if(e<=s) return;
        int pivotIndex=partition(arr,s,e);
        quickSort(arr,s,pivotIndex-1);
        quickSort(arr,pivotIndex+1,e);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivot=arr[e];
        int i=s-1;
        for(int j=s; j<e;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[e];
        arr[e]=temp;
        return i;
    }
}
