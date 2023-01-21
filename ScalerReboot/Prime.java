package ScalerReboot;

public class Prime {
    public static boolean check_prime(int num){
        if (num==1) return false;
        int factors_count=0;
        for (int i=2;i*i<=num;i++){  // O(sqrt(n))
            if (num%i==0){
                if (num==num/i){
                    factors_count++;
                }
                if (factors_count>1) return false;
//                factors_count+=2;
//                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num =13;
        System.out.println(check_prime(num));

    }
}