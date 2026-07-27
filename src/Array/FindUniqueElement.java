package Array;

public class FindUniqueElement {
    public static void findUniqueElements(int[] arr) {
        int [] freq=new int[arr.length];
        for (int i: arr){
            freq[i]++;
        }
        for (int i: arr){
            if (freq[i]==1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,1,2,3};
        findUniqueElements(arr);
    }
}
