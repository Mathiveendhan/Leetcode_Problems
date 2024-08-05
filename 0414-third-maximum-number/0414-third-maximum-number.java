class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hash =new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(!hash.contains(nums[i])){
                hash.add(nums[i]);
                arr.add(nums[i]);
                count++;
            }
            if(count==4){
                break;
            }
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        if(arr.size()>=3){
            return arr.get(2);
        }else{
            return arr.get(0);
        }
    }
}