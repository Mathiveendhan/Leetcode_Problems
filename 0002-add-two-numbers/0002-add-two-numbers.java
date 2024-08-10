class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");

        ListNode tp1 = l1;
        while (tp1 != null) {
            sb1.append(tp1.val);
            tp1 = tp1.next;
        }
        
        ListNode tp2 = l2;
        while (tp2 != null) {
            sb2.append(tp2.val);
            tp2 = tp2.next;
        }
        
        int n1 = Integer.parseInt(sb1.toString());
        int n2 = Integer.parseInt(sb2.toString());
        int sum = n1 + n2;
        StringBuilder SB=new StringBuilder(""+sum);
        SB.reverse();
        String ssum=SB.toString();

        ListNode ans = new ListNode(0);
        ListNode head = ans;
        int i = 0;
        
        while (i < ssum.length()) {
            ListNode temp = new ListNode(ssum.charAt(i) - '0'); 
            ans.next = temp;
            ans = temp;
            i++;
        }
        
        return head.next;
    }
}
