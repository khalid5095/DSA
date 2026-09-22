package String;

import java.util.HashMap;

public class FrequencyHashMap {
    static void frequency(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for (Character c : map.keySet()){
            System.out.println(c+" : "+map.get(c));
        }
    }

    public static void main(String[] args) {
        String str="aba@@@cd";
        frequency(str);
    }
}
