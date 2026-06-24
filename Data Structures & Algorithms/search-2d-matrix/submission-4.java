class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int up = 0;
        int down = rows - 1;
        
        for (int[] row : matrix) {

            if (target >= row[0] && target <= row[cols - 1]) {
                int l = 0;
                int r = cols - 1;

                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (row[mid] > target) {
                        r = mid - 1;
                    } else if (row[mid] < target) {
                        l = mid + 1;
                    } else {
                        return true;
                    }
                }
                
            }
        }

        return false;
    }
}
