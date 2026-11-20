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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode uni=new ListNode(head.val);
        ListNode uniw=uni;
        ListNode ptr=head;
        
        
        while(ptr!=null)
        {
            if(ptr.next!=null&&ptr.val!=ptr.next.val)
            {
                uniw.next=new ListNode(ptr.next.val);
                uniw=uniw.next;
            }
            ptr=ptr.next;
        }
        return uni;
    }
}