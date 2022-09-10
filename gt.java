import java.util.Stack;

public class gt {
    Stack<Integer> st1= new Stack<>();
    Stack<Integer> st2=new Stack<>(); //sorted
//    Stack<Integer> st3=new Stack<>(); // tertiary
    public void push(int x) {
       if (st2.isEmpty()){
           st2.push(x);
       }
       else{
           st2.push(Math.min(x,st2.peek()));
       }
        st1.push(x);

    }

    public void pop() {
        st1.pop();
        st2.pop();

    }

    public int top() {
        return st1.peek();
    }

    public int getMin() {
        return st2.peek();
    }

    public static void main(String[] args) {

    }
}
