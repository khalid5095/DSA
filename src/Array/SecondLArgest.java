package Array;

public class SecondLArgest {
    public static void main(String[] args) {
        int [] nums={12,14,18,3,5,91,41};
        int largest=0;
        int secondLargest=Integer.MIN_VALUE;
        for (int num : nums) {
            if (num>largest){
                secondLargest=largest;
                largest=num;
            }else if (num>secondLargest && num != largest){
                secondLargest=num;
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second largest: "+secondLargest);
    }
}
