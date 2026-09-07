package Array;

public class LinearSearch {
    static int linearSearch(int [] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) return  i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums={2,6,3,67,18,49};
        int target=189;
        if(linearSearch(nums,target)!=-1){
        int result = linearSearch(nums,target);
        System.out.println("Element Found at index: "+result);}
        else{
            System.out.println("Not found");
        }
    }
}
