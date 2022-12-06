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
    public ListNode oddEvenList(ListNode head) {
        ListNode dmy_odd = new ListNode(-1);
        ListNode dmy_ev = new ListNode(-1);
        ListNode odd = dmy_odd;
        ListNode even = dmy_ev;
        int n=1;
        ListNode curr = head;
        while(curr != null){
            if(n%2==1){
                odd.next = curr;
                odd = odd.next;
            }
            else{
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
            n++;
        }
        even.next = null;
        odd.next = dmy_ev.next;
        return dmy_odd.next;
    }
}
