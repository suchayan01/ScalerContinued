public class Sort {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        String s= "";
        // for(int i=0;i<A.length;i++){
        //     A[i]= Integer.toString(A[i]);
        // }
        for (int i=0;i<A.length;i++){
            for( int j=i+1;j<A.length;j++){
                if (Integer.toString(A[i])+ Integer.toString(A[j])<
                        Integer.toString(A[j])+Integer.toString(A[i])){
                    tmp= A[i];
                    A[i]=A[j];
                    A[j]= tmp;
                }
            }
        }

        for (String a: A){
            s+=a;
        }
        return s;
    }

    public static void main(String[] args) {
       int  A = new int []{3, 30, 34, 5, 9};
        System.out.println(largestNumber(A));
    }
}


