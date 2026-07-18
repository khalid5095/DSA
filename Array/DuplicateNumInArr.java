package Backend.DSA.Array;

public class DuplicateNumInArr {
    public static void findDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        System.out.println("No duplication found");
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,3,5,2};
       findDuplicate(arr);
    }
}
