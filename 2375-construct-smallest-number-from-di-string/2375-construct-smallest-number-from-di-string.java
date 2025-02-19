class Solution {
    public String smallestNumber(String pattern) {
        String s = "123456789";
        String ss = s.substring(0, pattern.length() + 1);  
        char[] str = ss.toCharArray();
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                char c = pattern.charAt(j);
                int a = str[j] - '0';
                int b = str[j + 1] - '0';
                if (c == 'I') {
                    if (a > b) {
                        a = a ^ b;
                        b = a ^ b;
                        a = a ^ b;
                        str[j] = (char) (a + '0');
                        str[j + 1] = (char) (b + '0');
                    }
                } 
                else {
                    if (a < b) {
                        a = a ^ b;
                        b = a ^ b;
                        a = a ^ b;
                        str[j] = (char) (a + '0');
                        str[j + 1] = (char) (b + '0');
                    }
                }
            }
        }
        return new String(str);
    }
}
