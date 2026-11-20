/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        if(head==null||head.next==null)return null;
        ListNode start=head;
        ListNode tail=head;
        while(tail.next!=null&&tail.next.next!=null)
        {
            start=start.next;
            tail=tail.next.next;
            if(start==tail)
            {
                ListNode ptr=head;
                while(ptr!=tail)
                {
                    ptr=ptr.next;
                    tail=tail.next;
                }
                return ptr;
            }
            
        }
        return null;
    }
}