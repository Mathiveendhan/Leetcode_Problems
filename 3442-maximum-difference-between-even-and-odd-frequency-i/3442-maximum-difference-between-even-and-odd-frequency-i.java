class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for (int freq : freqMap.values()) {
            if (freq % 2 == 1) {
                maxOdd = Math.max(maxOdd, freq);
            } else {
                minEven = Math.min(minEven, freq);
            }
        }
        if (maxOdd != Integer.MIN_VALUE && minEven != Integer.MAX_VALUE) {
            return maxOdd - minEven;
        } else {
            return -1; 
        }
    }
}

// class Solution {
//     public int maxDifference(String s) {
//         ArrayList<Integer> even =new ArrayList<>();
//         ArrayList<Integer> odd =new ArrayList<>();
//         HashMap<Character,Integer> map=new HashMap<>();
//         HashSet<Character> set=new HashSet<>();
//         for(char c:s.toCharArray()){
//             if(!map.containsKey(c)){
//                 map.put(c,1);
//                 set.add(c);
//             }else{
//                 map.put(c,map.get(c)+1);
//             }
//         }
//         for(char ch:set){
//             if(map.get(ch)%2==0){
//                 even.add(map.get(ch));
//             }else{
//                 odd.add(map.get(ch));
//             }
//         }
//         // System.out.println(even);
//         // System.out.println(odd);
//         int max=Integer.MIN_VALUE;
//         for(int i:odd){
//             for(int j:even){
//                 if(max<(i-j)){
//                     max=(i-j);
//                 }
//             }
//         }
//         return max;      
//     }
// }