import java.util.*;

public class Solution {
	public static ArrayList<Integer> grayCode(int a) {
        System.out.println(a);
        int maxnum=0;
        while(a>=0){
            a--;
            maxnum+=Math.pow(2,a);
            System.out.println(maxnum+"---------"+a);
        }
        ArrayList<Integer> numb= new ArrayList<>();
        for (int i=0;i<=maxnum;i++){
            numb.add(i);
        }
        return numb;
	}

    public static void main(String[] args) {
        System.out.println(grayCode(2));
    }
}
