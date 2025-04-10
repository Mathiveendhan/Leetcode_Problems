class Solution {
    public String digitSum(String s, int k) {
        String str = s;
        while (str.length() > k) { 
            ArrayList<String> arr = new ArrayList<>();
            for (int i = 0; i < str.length(); i += k) {
                if (i + k >= str.length()) { 
                    arr.add(str.substring(i, str.length()));
                } else {
                    arr.add(str.substring(i, i + k));
                }
            }
            StringBuilder sb = new StringBuilder(); 
            for (String st : arr) {
                int num = 0;
                for (char c : st.toCharArray()) {
                    num += c - '0'; 
                }
                sb.append(num);
            }
            str = sb.toString();
        }
        return str;
    }
}
