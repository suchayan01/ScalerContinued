import java.util.Arrays;

public class day21Q1 {
    static int[] st =new int [10];
    static int top=-1;
    public static void push(int x) {
        if (top==-1){
            top++;
        }
        st[top]=x;
        top++;

    }

    public static void pop() {
        if (top!=-1){
            top--;
        }
        else{
            System.out.println("Its already empty");
        }
    }

    public static int top() {
        return st[top-1];
    }

    public static int getMin() {
//        System.out.println(Arrays.toString(st));
        int min_num =st[0];
        for (int i=1;i<top;i++){
            min_num=Math.min(min_num,st[i]);
        }
        return min_num;
    }


    public static void main(String[] args) {
//        19 P 10 P 9 g- P 8 g P 7 g- P 6 g- p g p g p g p g p g
        push(19);
        push(10);
        push(9);
        System.out.println(getMin());
        push(8);
        System.out.println(getMin());
        push(7);
        System.out.println(getMin());
        push(6);
        System.out.println(getMin());



//        System.out.println(top+"----");
        pop();
//        System.out.println(top+"-------------");
        System.out.println(getMin());

        System.out.println(top());
    }



}
