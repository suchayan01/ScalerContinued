import java.util.ArrayList;
import java.util.Stack;

public class Tree2 {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> arr= new ArrayList<>();
        if (A== null){ return arr;}
        Stack<TreeNode> st = new Stack<>();
        st.push(A);
        TreeNode curr;
       while(!st.isEmpty()){
           curr= st.peek();
           arr.add(curr.val);
           st.pop();

           if (curr.right!=null){
               st.add(curr.right);
           }
           if(curr.left!=null){
               st.add(curr.left);
           }
       }
        return arr;
    }

}
