package Array;

public class SmallestAndLargestFromArray {
    public static void main(String[] args) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
    int[] nums={12,15,2,77,8,5};
        for (int i:nums){
        if (i>largest) {
            largest = i;
        }
        else if (i<smallest) {
            smallest = i;
        }
    }
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
}
}
