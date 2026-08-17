class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int r = 0; r < board.length; r++){
            rows[r] = new HashSet<>();
            int rowBand = r/3;
            for(int c = 0; c < board[r].length; c++){
                int colBand = c/3;
                if(cols[c] == null){
                    cols[c] = new HashSet<>();
                }
                if(boxes[rowBand*3+colBand] == null){
                    boxes[rowBand*3+colBand] = new HashSet<>();
                }
                if(board[r][c] != '.'){

                    boolean isPresentRow = !(rows[r].add(board[r][c]));
                    boolean isPresentCol = !(cols[c].add(board[r][c]));
                    boolean isPresentBox = !(boxes[rowBand*3+colBand].add(board[r][c]));
                    if(isPresentRow || isPresentCol || isPresentBox)
                        return false;
                }
            }
        }

        return true;

    }
}
