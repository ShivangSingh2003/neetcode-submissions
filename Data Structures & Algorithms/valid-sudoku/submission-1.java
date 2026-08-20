class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                char ch = board[r][c];
                if(ch == '.')
                    continue;
                int rowBand = r/3;
                int colBand = c/3;
                int boxId = rowBand*3 + colBand;
                
                if(!rows[r].add(ch) || !cols[c].add(ch) || !boxes[boxId].add(ch))
                    return false;
            }
        }

        return true;
    }
}
