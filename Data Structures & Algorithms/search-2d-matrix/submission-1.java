class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bot = m*n-1;

        while(top <= bot){
            int mid = (top+bot)/2;
            int row = mid/n;
            int col = mid%n;
            int num = matrix[row][col];

            if(num < target)
                top = mid+1;
            else if(num > target)
                bot = mid-1;
            else 
                return true;
        }

        return false;
    }
}
