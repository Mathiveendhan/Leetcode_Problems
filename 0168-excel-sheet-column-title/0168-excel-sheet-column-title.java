class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder bd = new StringBuilder();
        while(columnNumber>0){
            columnNumber = columnNumber-1;
            bd.append((char)((columnNumber%26)+'A'));
            columnNumber=columnNumber/26;
        }  
        return bd.reverse().toString();
    }
}