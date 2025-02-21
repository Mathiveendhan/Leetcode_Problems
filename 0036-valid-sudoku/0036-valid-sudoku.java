class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Checking rows
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (!set.contains(board[i][j])) {
                        set.add(board[i][j]);
                    } else {
                        return false;
                    }
                }
            }
        }

        // Checking columns
        for (int a = 0; a < board[0].length; a++) {
            Set<Character> sett = new HashSet<>();
            for (int b = 0; b < board.length; b++) {
                if (board[b][a] != '.') {
                    if (!sett.contains(board[b][a])) {
                        sett.add(board[b][a]);
                    } else {
                        return false;
                    }
                }
            }
        }

        // Checking 3x3 sub-boxes
         for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Character> subgrid = new HashSet<>();
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (board[x][y] != '.') {
                            if (!subgrid.contains(board[x][y])) {
                                subgrid.add(board[x][y]);
                            } else {
                                return false; 
                            }
                        }
                    }
                }
            }
        }    
        return true;
    }
}
