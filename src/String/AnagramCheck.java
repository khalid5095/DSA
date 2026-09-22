package String;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Collections;

public class AnagramCheck {
    static boolean checkAnagram(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        char[] s3=s1.toCharArray();
        Arrays.sort(s3);
        char[] s4=s2.toCharArray();
        Arrays.sort(s4);
        if (!Arrays.equals(s3,s4)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1="listen";
        String s2="sileng";
        System.out.println(checkAnagram(s1,s2));
    }
}
