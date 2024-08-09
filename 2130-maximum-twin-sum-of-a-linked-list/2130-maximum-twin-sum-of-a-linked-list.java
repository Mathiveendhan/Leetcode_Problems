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
    public int pairSum(ListNode head) {
     ArrayList<Integer> arr=new ArrayList<>();
     ListNode clone=head;
     while(clone!=null){
        arr.add(clone.val);
        clone=clone.next;
     }   
     ArrayList<Integer> max=new ArrayList<>();
     int mid=(0+arr.size()-1)/2;
     int first=0;
     int last=arr.size()-1;;
     for(int i=0;i<=mid;i++){
        int sum=arr.get(first)+arr.get(last);
        max.add(sum);
        first++;
        last--;
     }
     int ans=Collections.max(max);
     return ans;
    }
}