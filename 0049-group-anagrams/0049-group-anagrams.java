class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] array = str.toCharArray();
			Arrays.sort(array);
			String sortedStr = new String(array);
			List<String> list = map.getOrDefault(sortedStr, new ArrayList<>());
			list.add(str);
			map.put(sortedStr, list);
		}
		return new ArrayList<>(map.values());
    }
}

// import java.util.*;

// class Solution {
//     public static boolean check(String s1, String s2) {
//         char[] c1 = s1.toCharArray();
//         char[] c2 = s2.toCharArray();
//         Arrays.sort(c1);
//         Arrays.sort(c2);
//         return Arrays.equals(c1, c2);
//     }

//     public static List<String> call(String s, ArrayList<String> arr) {
//         ArrayList<String> anss = new ArrayList<>();
//         anss.add(s);
//         arr.remove(s);

//         for (String z : new ArrayList<>(arr)) {
//             if (check(s, z)) {
//                 anss.add(z);
//                 arr.remove(z);
//             }
//         }
//         return anss;
//     }

//     public List<List<String>> groupAnagrams(String[] strs) {
//         ArrayList<String> str = new ArrayList<>();
//         for (String r : strs) {
//             str.add(r);
//         }

//         List<List<String>> ans = new ArrayList<>();

//         while (!str.isEmpty()) {
//             String cur = str.get(0);
//             ans.add(call(cur, str));
//         }

//         return ans;
//     }
// }
