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
        ListNode Dt=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(Dt!=null){
            arr.add(Dt.val);
            Dt=Dt.next;
        }
        if(arr.size()==0){
            return null;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.size();i+=2){
            ans.add(arr.get(i));
        }
        for(int j=1;j<arr.size();j+=2){
            ans.add(arr.get(j));
        }
        ListNode temp=new ListNode(arr.get(0));
        ListNode Head=temp;
        for(int k=1;k<ans.size();k++){
            ListNode tmp=new ListNode(ans.get(k));
            temp.next=tmp;
            temp=tmp;
        }
        return Head;
    }
}