import java.util.Arrays;

//  * Definition for singly-linked list.
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) {
          val = x; next = null;
      }
  }

public class Sol1 {
    public static ListNode solve(int[][] A) {
        System.out.println(Arrays.deepToString(A));

        // actual logic
        ListNode head = null, tail = null;
        int ll_length=0;
        for(int row=0;row<A.length;row++){
            int col0 =A[row][0];
            int col1 =A[row][1];
            int col2 =A[row][2];

            ListNode temp = new ListNode(col1);
            ListNode prev=head,nextptr= head;
            if (col0==0){ // insertion at 0th index
                System.out.println("insertion at 0th index");
                if (head==null){head=temp;tail= head;}
                else{
                    temp.next= head;
                    head= temp;
                }
                ll_length+=1;
//                System.out.println("cnkdscskc"+ll_length);
            }
//            System.out.println("length"+ll_length);
            if (col0==1){ //append at last
                System.out.println("append at last");
                if (head==null){head=temp;tail= head;}
                else{
                    tail.next=temp;
                    tail = temp;
                }
                ll_length+=1;
            }
            if(col0==2){ // add at ith index

                System.out.println("add at ith index head"+ col2+"-----"+ll_length);
                if (head==null  ){
                    // do nothing
//                    System.out.println("here issue");
                    temp.next= head;
                    head= temp;
                    tail=head;
                }
                else if (col2==0){
                    temp.next= head;
                    head= temp;
                }
                else if (col2== ll_length){tail.next=temp;tail = temp;}
                else{
//                    System.out.println("Here");

                    int pos =1;
                    while(pos< col2){
//                        System.out.println(pos+" 99999999 "+col2);
                        prev=prev.next;
//                        System.out.println(prev.val+"------67t7tgu");
                        pos++;
                    }
//                    System.out.println("here11"+ prev.val);
                    nextptr=prev.next;
//                    System.out.println("prev"+prev.val+"---------------next "+nextptr);
                    prev.next=temp;
                    prev.next.next=nextptr;
                }
                ll_length+=1;
            }
            if (col0==3){// delete ith index note
                System.out.println("delete ith index note col2 "+col1+"---- "+ll_length);
             /*   if (col1-1<ll_length && col1>=0){
                    System.out.println("here");
                    //need to handle col2=0
                    if (col1==0){
                        head=head.next;
                    }
                }*/
                if(col1-1<ll_length && col1>=0 && ll_length>0){
                    //need to handle col2=0
                    ll_length-=1;
                    if (col1==0){
                        head=head.next;
                        continue;
                    }
                    int pos=1;
                    while(pos< col1){
                        prev=prev.next;
                        pos++;
                    }
                    System.out.println(prev.val + "********");
                    if (col1-1==ll_length){
                        prev.next=null;
                        continue;
                    }
                        prev.next = prev.next.next;

                }
            }
        }


        return head;
    }


    public static void main(String[] args) {
        int[][] A= new int [][] {{0,1,-1},{1,2,-1},{2,3,1}};
        int[][] B= new int [][] {{0, 1, -1},{1, 2, -1},{2, 3, 1},{0, 4, -1},{3, 1, -1},{3, 2, -1}} ;
        int[][] C= new int [][] {
  {1, 13, -1},
  {3, 0, -1},
  {3, 1, -1},
  {2, 15, 0},
  {3, 0, -1},
  {1, 12, -1},
  {3, 0, -1},
  {1, 19, -1},
  {1, 13, -1},
  {3, 0, -1},
  {0, 12, -1},
  {1, 13, -1},
  {3, 2, -1},
};

        int [][] D = new int [][] {
  {2, 15, 0},
  {1, 11, -1},
  {3, 1, -1},
  {2, 14, 0},
};
        int [][] E= new int [][] {
  {3, 1, -1},
  {3, 1, -1},
  {1, 18, -1},
  {2, 12, 1},
  {1, 17, -1},
  {2, 11, 3},
  {1, 19, -1},
  {3, 0, -1},
  {0, 12, -1},
};
        ListNode node =solve(D);
        System.out.println("--------------------------------------------------");
        while(node!=null){
            System.out.print(node.val+"-->");
            node=node.next;
        }
        System.out.print("NULL");

    }
}
