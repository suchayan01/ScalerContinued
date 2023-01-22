package ScalerReboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class factors {
    public static  ArrayList<Integer> solve(ArrayList<Integer> A) {
         ArrayList<Integer> arr = new ArrayList<>();
         int max_num= Collections.max(A);
        int div[] = new int[max_num+1];
        Arrays.fill(div,1);
        for (int j =2;j<=max_num;j++){
            for (int i=j;i<=max_num;i+=j) div[i]++;
        }
        for (int i: A)arr.add(div[i]);
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        num.add(5);
        num.add(8);
        num.add(9);
        num.add(10);
        System.out.println(solve(num));
    }
}
