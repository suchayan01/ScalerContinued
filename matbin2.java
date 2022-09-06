public class matbin2 {
    public static int searchMatrix(int[][] A, int B) {
        int l= 0, h= A[0].length-1, row=-1;
        while(l<=h){
            int mid= l+(h-l)/2;
            if (A[A[0].length-1][mid]==B){
                return 1;
            }
            if (A[mid][0]<=B  && A[mid][A[0].length-1]>=B){
                row= mid;
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][]A= new int[][]{{3, 4, 9, 10, 14, 17, 18, 20, 29, 32},{33, 36, 38, 46, 51, 52, 56, 56, 56, 58},{66, 72, 72, 76, 76, 76, 82, 85, 90, 96}};

        int B =56;
        System.out.println(searchMatrix(A,B));

    }
}
