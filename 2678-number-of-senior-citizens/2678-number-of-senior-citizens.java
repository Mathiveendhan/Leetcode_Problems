class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String ch:details){
            String a=ch.substring(11,13);
            if(Integer.parseInt(a)>60){
                count++;
            }
        }
        return count;
    }
}