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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode(0);
        ListNode curr=ans;
        ListNode first=list1;
        ListNode second=list2;

        while(first != null && second != null){
            if(first.val<=second.val){
                curr.next=new ListNode(first.val);
                first=first.next;
            }else{
                curr.next=new ListNode(second.val);
                second=second.next;
            }
            curr=curr.next;
        }

        while(first!=null){
            curr.next=new ListNode(first.val);
            first=first.next;
            curr=curr.next;

        }

        while(second!=null){
            curr.next=new ListNode(second.val);
            second=second.next;
            curr=curr.next;
        }

        return ans.next;

    }
}