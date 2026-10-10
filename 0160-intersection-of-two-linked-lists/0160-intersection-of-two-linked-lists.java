/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a1 = headA;
        ListNode a2 = headB;

        while(a1 != a2){
            if(a1 == null){
                a1 = headB;
            }else{
                a1 = a1.next;
            }

            if(a2 == null){
                a2 = headA;
            }else{
                a2 = a2.next;
            }
        }
        
        return a1;
        
        
    }
}