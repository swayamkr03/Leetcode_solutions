/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        int count=0;
        ListNode curr=head;
        Stack<ListNode> st=new  Stack<>();

        while(curr!=null){
            st.push(curr);
            count++;
            curr=curr.next;
        }

        curr=head;
        for(int i=0;i<count/2;i++){
            ListNode tail=st.pop();
            ListNode next=curr.next;

            curr.next=tail;
            tail.next=next;

            curr=next;

        }
        curr.next=null;





    }
}