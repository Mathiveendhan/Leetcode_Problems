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
    public static int call(int i, ArrayList<Integer> arr) {
        int sum = 0;
        for (int j = i + 1; j < arr.size(); j++) {
            if (arr.get(j) != 0) {
                sum += arr.get(j);
            } else {
                break;
            }
        }
        return sum;
    }

    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode tp = head;
        
        while (tp != null) {
            arr.add(tp.val);
            tp = tp.next;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                if (i + 1 < arr.size() && arr.get(i + 1) != 0) {
                    ans.add(call(i, arr));
                }
            }
        }

        if (ans.size() == 0) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        for (int value : ans) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummyHead.next;
    }
}
