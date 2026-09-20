package Array;

public class CheckSorted {
    //check array is sorted or not
    static void checkSorted(int [] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Sorted");
        }else {
            System.out.println("unsorted");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,6,4};
        checkSorted(arr);
    }
}
