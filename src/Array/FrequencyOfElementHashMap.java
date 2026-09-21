package Array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementHashMap {
    static void frequency(int [] arr){
        Map<Integer,Integer> fre=new HashMap<>();
        for (int i : arr){
            fre.put(i,fre.getOrDefault(i,0)+1);
        }
        System.out.println(fre);
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,1,2,3,1,2,3};
        frequency(arr);
    }
}
