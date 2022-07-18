public class A2 {
    public static int solve(int[] A) {
        int low=1,high=A.length-2,mid=-1;
//        if (A.length==2) {
            if (A[0] > A[1]) {
                return A[0];
            }
            if (A[A.length-2]<A[A.length-1]) {
                return A[A.length-1];
            }
//        }
        while(low<=high){
            mid=(low+high)/2;
//            System.out.println(mid);
            if (A[mid]>A[mid-1] && A[mid]>A[mid+1]){
                return A[mid];
            }
            else if (A[mid]<A[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return A[mid];
    }

    public static void main(String[] args) {
        int []A= new int[]{ 1, 2, 3, 4, 5 };
        System.out.println(solve(A));
    }
}
