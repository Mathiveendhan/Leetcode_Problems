class Solution {
    public int passThePillow(int n, int time) {
       int pass = 1;
        int direction = 0;
        while(time-->0){
            if(pass == 1) direction = 1;
            else if(pass == n) direction = -1;

            pass +=direction;
        }
        return pass;
    }
}