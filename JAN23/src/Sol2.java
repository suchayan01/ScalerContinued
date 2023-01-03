/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Sol2 {
    public ListNode solve(int[][] A) {
        ListNode head = null, tail = null;
        int ll_length=0;
        for(int row=0;row<A.length;row++){
            int col0 =A[row][0];
            int col1 =A[row][1];
            int col2 =A[row][2];

            ListNode temp = new ListNode(col1);
            ListNode prev=head,nextptr= head;
            if (col0==0){ // insertion at 0th index
                // System.out.println("insertion at 0th index");
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
                // System.out.println("append at last");
                if (head==null){head=temp;tail= head;}
                else{
                    tail.next=temp;
                    tail = temp;
                }
                ll_length+=1;
            }
            if(col0==2){ // add at ith index

                // System.out.println("add at ith index head"+ col2+"-----"+ll_length);
//                 if (head==null  ){
//                     // do nothing
// //                    System.out.println("here issue");
//                     temp.next= head;
//                     head= temp;
//                     tail=head;
//                 }
//                 else 
                if(col2 > ll_length || col2 < 0){
                    continue;
                }
                else if(col2 == ll_length){
                    if(tail == null){
                        tail = temp;
                        head = temp;
                    } else {
                        tail.next = temp;
                        tail = temp;
                    }
                } else if(col2 == 0){
                    temp.next = head;
                    head = temp;
                }
                else{
//                    System.out.println("Here");

                    int pos =1;
                    prev = head;
                    while(pos < col2){
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
                // System.out.println("delete ith index note col2 "+col1+"---- "+ll_length);
             /*   if (col1-1<ll_length && col1>=0){
                    System.out.println("here");
                    //need to handle col2=0
                    if (col1==0){
                        head=head.next;
                    }
                }*/
                if(col1 < 0 || col1 >= ll_length){
                // System.out.println("Hiii" + ll_length + " : " + col2);
                    continue;
                }else if(col1 == 0){
                    // System.out.println("Hiii" + ll_length + " " + "else");
                    if(ll_length == 1){
                        // System.out.println("Hiii" + ll_length);
                        head = null;
                        tail = null;
                    } else {
                        head = head.next;
                    }
                    ll_length -=1;
                } else {
                    int pos = 1;
                    prev = head;
                    
                    while(pos < col1){
                        prev = prev.next;
                        pos++;
                    }
                    prev.next = prev.next.next;
                    
                    if(prev.next == null){
                        tail = prev;
                    }
                    ll_length -=1;
                    //need to handle col2=0
                    // ll_length-=1;
                    // if (col1==0){
                    //     head=head.next;
                    //     continue;
                    // }
                    // int pos=1;
                    // while(pos< col1){
                    //     prev=prev.next;
                    //     pos++;
                    // }
                    // // System.out.println(prev.val + "********");
                    // if (col1-1==ll_length){
                    //     prev.next=null;
                    //     continue;
                    // }
                    //     prev.next = prev.next.next;
                }
                
            }
        }


        return head;
    }
}