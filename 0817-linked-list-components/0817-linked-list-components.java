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
import java.util.HashSet;

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int count = 0;
        boolean inComponent = false;
        ListNode current = head;

        while (current != null) {
            if (numSet.contains(current.val)) {
                if (!inComponent) {
                    count++;
                    inComponent = true;
                }
            } else {
                inComponent = false;
            }
            current = current.next;
        }

        return count;
    }
}
