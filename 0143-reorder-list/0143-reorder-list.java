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
    public void reorderList(ListNode head) {
        ListNode tmp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(tmp!=null){
            arr.add(tmp.val);
            tmp=tmp.next;
        }
        int mid=(0+arr.size()-1)/2;
        int last=arr.size()-1;
        int first=0;
        int idx=0;
        int[] ans=new int[arr.size()];
        for(int i=0;i<=mid;i++){
            if(first<=mid){
                ans[idx]=arr.get(first);
                first++;
            }
            idx++;
            if(last>mid){
                ans[idx]=arr.get(last);
                last--;
            }
            idx++;
        }
        int index=0;
        while(head!=null){
            head.val=ans[index];
            head=head.next;
            index++;
        }
    }
}