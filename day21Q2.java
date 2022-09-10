import java.util.Stack;

public class day21Q2 {
    public int solve(String A) {
        Stack<String> st = new Stack<>();
        for (char i:A.toCharArray()){
            if (i=='('){
                st.push(String.valueOf(i));

            }
        }

        return 0;
    }

    public static void main(String[] args) {
        day21Q2 x= new day21Q2();
        System.out.println(x.solve("(()())"));
    }

}
