public class mat_bin {
    public static  int searchMatrix(int[][] A, int B) {
        int col=A[0].length-1,upper=-1;
        int left =0, right = A.length-1,mid=-1;
        while(left<=right){
            mid= left+(right-left)/2;
//            System.out.println(mid+"----"+col+"------"+A[mid][col]);
            System.out.println(left+"-----"+right+"---"+mid);
            if (A[mid][col]==B){
                return 1;
            }
            else if (A[mid][col]>B){
                right= mid-1;
                upper=mid;
            }
            else {
                left=mid+1;

            }
        }
        System.out.println("Row num: "+mid);
//        int upper=mid;
        System.out.println("upper "+upper);
        System.out.println("------------------Lower---------------------");
        //find lower
        left =0;
        right=A.length-1;
        int lower=-1;
        while(left<=right){
            mid= left+(right-left)/2;
//            System.out.println(mid+"----"+col+"------"+A[mid][col]);
            System.out.println(left+"-----"+right+"---"+mid+"-----"+A[mid][0]+"---"+B);
            if (A[mid][0]==B){
                return 1;
            }
            else if (A[mid][0]>B){
                right= mid-1;
//                System.out.println("exceeded"+(mid)+"---"+left+"---"+right);
            }
            else {
                left=mid+1;
                System.out.println("lower"+(mid+1));
                lower = mid;
            }
        }
//        System.out.println(mid);
//        lower=mid;
//        System.out.println("lower "+lower);
        int row = Math.min(upper,lower);
        left=0;
        right=col;
        while(left<=right){
//            System.out.println(left+"--------"+right+"------------"+row+"----");
            mid= left+(right-left)/2;
            System.out.println(mid+"----"+A[row][mid]);
            if (A[row][mid]==B){
                return 1;
            }
            else if(A[row][mid]<B){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return 0;
    }
    public static void main(String[] args) {
//        int [][]A =new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50} };
//        int B = 11;
       int[][] A = new int[][]{{3}, {29}, {36}, {63}, {67}, {72}, {74}, {78}, {85}};
//       A=new int[][]{{2, 9, 12, 13, 16, 18, 18, 19, 20, 22},{29, 59, 62, 66, 71, 75, 77, 79, 97, 99}};
        A= new int[][]{{3, 4, 9, 10, 14, 17, 18, 20, 29, 32},{33, 36, 38, 46, 51, 52, 56, 56, 56, 58},{66, 72, 72, 76, 76, 76, 82, 85, 90, 96}};

        int B =56;

        System.out.println(searchMatrix(A,B));
    }

}
