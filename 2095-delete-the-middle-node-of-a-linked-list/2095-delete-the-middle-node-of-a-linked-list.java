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
    public ListNode deleteMiddle(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        if(arr.size()==1){
            return null;
        }
        int mid=(0+arr.size()-1)/2;
        if(arr.size()%2==1){
            arr.remove(mid);
        }else{
            arr.remove(mid+1);
        }
        ListNode Head=new ListNode(arr.get(0));
        ListNode noting=Head;
        for(int i=1;i<arr.size();i++){
            ListNode tempp=new ListNode(arr.get(i));
            noting.next=tempp;
            noting=tempp;
        }
        return Head;
    }
}