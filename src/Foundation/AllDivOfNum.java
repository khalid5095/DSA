package Foundation;

import java.util.ArrayList;
import java.util.Collections;

public class AllDivOfNum {
    public static ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int n=20;
        System.out.println(getDivisors(n));
    }
}
