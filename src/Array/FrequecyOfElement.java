package Array;

public class FrequecyOfElement {
    public static void main(String[] args) {
        int [] nums={1,2,2,2,3,4,2,3,3,5,4,4,4,6};
        boolean[] visited=new boolean[nums.length];
        for (int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for (int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(nums[i]+" : accurs in array : "+count+" times");
        }
    }
}
