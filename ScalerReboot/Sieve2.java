package ScalerReboot;

import java.util.Arrays;

public class Sieve2 {
    // TC = jmax*O(log(log(imax))= n* O(log(log(n)))= O(nlog(log(n))
//    since for every i we are visiting jmax/2
    // sc= O(n)
    public static void getPrime(int num){
        boolean prime_arr[]= new boolean [num+1];
        Arrays.fill(prime_arr,true);
        prime_arr[0]= prime_arr[1]= false;
        for(int i=2;i<=num;i++){ // O(n)
            if (prime_arr[i]==false){
                // do nothing
                continue;
            }
            for(int j=i*i;j<=num;j+=i){ // O(sqrt(n))
                prime_arr[j]=false;
            }
        }
        // get the nos
        System.out.print("[ ");
        for(int i=0;i<prime_arr.length;i++){

            if (prime_arr[i]==true) System.out.print(i +" ,");
        }
        System.out.println(" ]");

    }
    public static void main(String[] args) {
        getPrime(30);
    }
}
