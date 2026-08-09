package LeetCode;

public class LongestCommonPrefix_14 {
    static String longestCommonPrefix(String[] strs) {
        String lstr="";
        for (int i=0;i<strs[0].length();i++){
            String str=strs[0].substring(0,i+1);
            for(int j=1;j<strs.length;j++){
                if(!strs[j].startsWith(str)){
                    return lstr;
                }
            }
            lstr=str;
        }
        return lstr;
    }

    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
