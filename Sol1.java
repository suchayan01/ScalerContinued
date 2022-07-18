import java.util.Arrays;

public class Sol1 {
    public static int search(final int[] A, int B) {
//        System.out.println("Here");

        int left=1, right=A.length-2,mid=0;
        while(left<=right){
            mid= left+(right-left)/2;
//            System.out.println(mid);
            if (A[mid-1]<A[mid] && A[mid+1]<A[mid]) {
               mid=mid+1;
               break;
            }
            else if (A[mid-1]>A[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        left=0;
        right=A.length-1;
        if (A[mid-1]<B){
            right=mid-1;
        }
        else{
           left=mid+1;
        }
        int index=-1;
        System.out.println("--------------");
        while(left<=right){
            mid= left+(right=left)/2;
            if (A[mid]==B) return mid;
            if (A[mid]<B){
                index= Math.max(index,mid);
                left=mid+1;
            }
            else{
                right= mid+1;

            }

        }
        System.out.println(index+"-------------"+A[index]);

        return -1;
    }

    public static void main(String[] args) {
        int []A =new int[] {4, 5, 6, 7, 0, 1, 2, 3};
        int B = 4;
        System.out.println(search(A,B));
    }
}
