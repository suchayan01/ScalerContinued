import java.util.*;


// * Definition for binary tree
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) {
      val = x;
      left=null;
      right=null;
     }
 }

public class Tree1 {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> arr= new ArrayList<>();
        return recur(A, arr);
    }
    ArrayList<Integer> recur(TreeNode A, ArrayList<Integer> arr){
        arr.add(A.val);
        if(A.right==null && A.left ==null){
            return arr;
        }
        else if (A.left== null) {
            recur(A.left, arr);
        }

        return recur(A.right,arr);
    }
}
