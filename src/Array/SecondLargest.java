package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 3, 5,122, 27, 8, 29,29};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if (arr[i]<largest && arr[i]!=secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest Element: "+largest);
        System.out.println("Second Largest: "+secondLargest);
    }
}
