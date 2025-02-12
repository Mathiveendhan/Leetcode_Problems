class Solution {
    public static String call(String str, int a, int b) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (!(i < a || i >= b)) {
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String removeOccurrences(String s, String part) {
        String str = s;
        while (str.contains(part)) {
            int index = str.indexOf(part);
            str = call(str, index, index + part.length());
        }
        return str;
    }
}
