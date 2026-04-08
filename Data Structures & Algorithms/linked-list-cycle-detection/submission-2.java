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
    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        Map<ListNode, Integer> adrMap = new HashMap<>();
        int index = 0;

        if (head == null) {
            return false;
        }

        while (node.next != null) {
            if (adrMap.containsKey(node)) {
                return true;
            }
            else {
                adrMap.put(node, index);
                index++;
            }

            node = node.next;
        }
        return false;
    }
}
