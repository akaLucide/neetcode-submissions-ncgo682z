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
        ListNode head = new ListNode(-1);
        ListNode currNode = head;
        ListNode tmpNode = null;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                tmpNode = list1;
                list1 = list1.next;
            }
            else {
                tmpNode = list2;
                list2 = list2.next;
            }

            currNode.next = tmpNode;
            currNode = currNode.next;

        }

        if (list1 == null) {
            while (list2 != null) {
                tmpNode = list2;
                currNode.next = tmpNode;
                currNode = currNode.next;
                list2 = list2.next;
            }
        }
        else if (list2 == null) {
            while (list1 != null) {
                tmpNode = list1;
                currNode.next = tmpNode;
                currNode = currNode.next;
                list1 = list1.next;
            }
        }

        return head.next;
    }
}