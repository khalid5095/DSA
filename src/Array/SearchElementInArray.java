package Array;

public class SearchElementInArray {
    //Linear Search
    public void linearSearch(int[] num,int target){
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                System.out.println("Element found at index "+i+" in array");
                return;
            }
        }
        System.out.println("Element not found in array");
    }
    //Binary Search
    public void binarySearch(int[] num,int target){
        int start=0;
        int end=num.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                System.out.println("Element found at index " + mid + " in array");
                return;
            }
            if (target < num[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        SearchElementInArray obj=new SearchElementInArray();
        int[] nums={1,2,3,4,5,6,7,8,9};
        int target=6;
        obj.linearSearch(nums,target);
        obj.binarySearch(nums,target);
    }
}
