package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NonRepeating {
    static void nonRepating(String str){
        HashMap<Character,Integer>map=new LinkedHashMap<>();
        for (int i=0; i<str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        //
        System.out.println(map);
        for (char c:map.keySet()) {
            if (map.get(c)==1){
                System.out.println("Non Repeating: "+c);
                return;
            }
        }
    }

    public static void main(String[] args) {
        String str="bcbacfsagjkagba";
        nonRepating(str);
    }
}
