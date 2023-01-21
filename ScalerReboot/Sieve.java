package ScalerReboot;

import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {
//    fwd looking approach , approx under no of primes = n/ log(n)
   public static int [] isPrime(int num){
       boolean [] prime_arr= new boolean[num];
       Arrays.fill(prime_arr,true);
       ArrayList<Integer> arr= new ArrayList<>();
       int count=0,pos=1;
//       for (int i=0;i*i<num;i)
       System.out.println("---------------");
       System.out.println(Arrays.toString(prime_arr));
       System.out.println("---------------");

       // logic to eliminate non primes
       for (int j =0;j<num;j++) {
           for (int i = j; i * i < num; i++) {
               if (prime_arr[i] && i!=j) {
                    prime_arr[i]= false;
               }
           }
       }

       System.out.println("-----Post Change----------");
       System.out.println(Arrays.toString(prime_arr));
       System.out.println("---------------");

       for (boolean b : prime_arr){
           pos++;
           if (b==true) {
               count++;
               arr.add(pos+1);
           }
       }
       int arr1[]= arr.stream().mapToInt(i->i).toArray();
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPrime(30)));
    }
}
