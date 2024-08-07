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
    public static ListNode head;
    public static ListNode tail;
    public static int size;

    public void addlast(int item) {
        ListNode nn = new ListNode(item);
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
        } else {
            this.tail.next = nn;
            this.tail = nn;
        }
        this.size++;
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        ListNode newHead = null;
        ListNode newTail = null;

        ListNode temp = head;
        while (temp != null) {
            if (!numSet.contains(temp.val)) {
                if (newHead == null) {
                    newHead = new ListNode(temp.val);
                    newTail = newHead;
                } else {
                    newTail.next = new ListNode(temp.val);
                    newTail = newTail.next;
                }
            }
            temp = temp.next;
        }

        return newHead;
    }
}