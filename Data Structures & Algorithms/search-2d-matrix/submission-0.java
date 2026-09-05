class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowTop = 0;
        int rowBottom = matrix.length - 1;

        while(rowTop <= rowBottom){
            int rowMid = (rowTop+rowBottom)/2;
            int left = 0;
            int right = matrix[rowMid].length - 1;

            if(matrix[rowMid][left] > target){
                rowBottom = rowMid-1;
                continue;
            }
            else if(matrix[rowMid][right] < target){
                rowTop = rowMid+1;
            }
            else{
                while(left <= right){
                    int mid = (left+right)/2;
                    if(matrix[rowMid][mid]>target){
                        right = mid-1;
                        continue;
                    }
                    else if(matrix[rowMid][mid]<target){
                        left = mid+1;
                        continue;
                    }
                    else{
                        return true;
                    }
                }
                return false;
            }
        }

        return false;
    }
}
