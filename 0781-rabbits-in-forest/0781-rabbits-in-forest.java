class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int rabbits = 0;
        for (int answer : answers) {
            if (!map.containsKey(answer)) {
                map.put(answer, 1);
                rabbits += answer + 1;
            } else {
                map.put(answer, map.get(answer) + 1);
            }
            if (map.get(answer) == answer + 1) {
                map.remove(answer);
            }
        }
        return rabbits;
    }
}