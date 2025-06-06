class Solution {
     public static void call(StringBuilder sb,int idx,char[] arr,List<String> ans){
        if(idx==arr.length){
            ans.add(sb.toString());
            return;
        }
        if(arr[idx]>='0' && arr[idx]<='9'){
            call(sb.append(arr[idx]),idx+1,arr,ans);
            sb.deleteCharAt(sb.length() - 1);
        }else{
            sb.append(Character.toLowerCase(arr[idx]));
            call(sb,idx+1,arr,ans);
            sb.deleteCharAt(sb.length()-1);

            sb.append(Character.toUpperCase(arr[idx]));
            call(sb,idx+1,arr,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static List<String> letterCasePermutation(String s){
        char[] arr=s.toCharArray();
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        call(sb,0,arr,ans);
        return ans;
    }
}