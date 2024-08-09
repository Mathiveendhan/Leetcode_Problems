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
    public ListNode middleNode(ListNode head) {
       ArrayList<Integer> arr=new ArrayList<>();
       ListNode tmp=head;
       while(tmp!=null){
        arr.add(tmp.val);
        tmp=tmp.next;
       } 
       int initial=0;
       if(arr.size()%2==0){
         initial=((0+arr.size()-1)/2)+1;
       }else{
        initial=(0+arr.size()-1)/2;
       }
       ListNode cur=new ListNode(arr.get(initial));
       ListNode current=cur;
       for(int i=initial+1;i<arr.size();i++){
        ListNode temp=new ListNode(arr.get(i));
        current.next=temp;
        current=temp;
       }
       return cur;
    }
}