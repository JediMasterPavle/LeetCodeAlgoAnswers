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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if (l1==null && l2==null){return new ListNode(0);}
        
        ListNode temp =new ListNode(-1);
        ListNode ret=temp;
        int carry=0;
        int value=0;
        
        while (l1!=null || l2!=null){
            value=carry;
            if(l1!=null){
                
                value+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                value+=l2.val;
                l2=l2.next;
            }
            carry=value/10;
            temp.next=new ListNode(value%10);
            temp=temp.next;
        }
        
        if(carry!=0) {
            temp.next=new ListNode(1);
        }
        
        return ret.next;

        
    }
}