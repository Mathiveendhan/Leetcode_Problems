class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target[i]){
                count++;
            }
        }
        if(count==arr.length){
            return true;
        }
        return false;
        // int count=0;
        // HashSet<Integer> hash=new HashSet<>();
        // for(int i=0;i<target.length;i++){
        //     hash.add(target[i]);
        // }
        // for(int it:arr){
        //     if(hash.contains(it)){
        //         count++;
        //     }
        // }
        // if(count==arr.length){
        //     return true;
        // }else{
        //     return false;
        // }
    }
}