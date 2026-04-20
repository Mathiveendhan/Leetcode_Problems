class Solution {
    public static boolean isValid(char ch,char[][] board,int r,int c){
        for(int i=0;i<board[0].length;i++){
            if(ch==board[r][i]){
                return false;
            }
        }

        for(int i=0;i<board[0].length;i++){
            if(ch==board[i][c]){
                return false;
            }
        }

        for(int i=0;i<board[0].length;i++){
            if(board[3*(r/3)+ i/3][3*(c/3)+i%3]==ch){
                return false;
            }
        }
        return true;

    }
    public static boolean call(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(int c=1;c<=board[0].length;c++){
                        char ch=(char)(c+'0');
                        if(isValid(ch,board,i,j)){
                            board[i][j]=ch;
                            if(call(board)==true){
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
     call(board);   
    }
}