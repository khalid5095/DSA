package String;

public class Frequency {
    static void frequency(String str){
        int [] arr=new int[256];  //ASCII values range from 0 to 255
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int x=(int)ch;
            arr[x]++;
        }
        //print the array
        for(int i=0; i< arr.length;i++){
            if (arr[i]!=0){
            System.out.println((char) i +" : "+ arr[i]);
        }
        }
    }

    public static void main(String[] args) {
        String str="aabbbccccddd&&&@@@$";
        frequency(str);
    }
}
