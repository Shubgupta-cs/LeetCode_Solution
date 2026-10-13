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
        ListNode currA = headA,currB = headB;
        int c1 = 0,c2 =0;
        while(currA != null){
            c1++;
            currA = currA.next;
        }
        while(currB != null){
            c2++;
            currB = currB.next;
        }
        currA = headA;
        currB =headB;
        if(c1>c2){
            int sub = Math.abs(c1-c2);
            for(int i = 0;i<sub;i++){
                currA = currA.next;
            }
        }
        else{
            int sub = Math.abs(c1-c2);
            for(int i = 0;i<sub;i++){
                currB = currB.next;
            }
        }
        while(currB != null && currA != null){
                if(currA == currB){
                    return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;
    }
}