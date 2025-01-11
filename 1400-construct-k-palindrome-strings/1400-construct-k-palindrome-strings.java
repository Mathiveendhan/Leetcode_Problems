import java.util.*;
class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        int count=0;
        // for(int cc:map.values()){
        //     if(cc%2!=0){
        //         count++;
        //     }
        // }
        for(char cc:map.keySet()){
            if(map.get(cc)%2!=0){
                count++;
            }
        }

        if(count>k){
            return false;
        }
        return true;
    }
}