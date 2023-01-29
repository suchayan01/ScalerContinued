package ScalerReboot;

import java.util.Arrays;

public class DoorClose {
    public static int solve(int A) {

        // find spf
        int [] spf = new int [A+1];
         Arrays.fill(spf, 1);
        spf[0]=0;
        for (int i=2;i<=A;i++){
            for (int j=i;j<=A;j+=i){
                spf[j]++;
            }
        }
//        System.out.println(Arrays.toString(spf));
        int OpenDr=0;
        for( int i:spf){
            if (i!=0 && i%2!=0){
                OpenDr++;
            }
        }
        return OpenDr;
    }

    public static void main(String[] args) {
        System.out.println(solve(9087738));
    }

}
