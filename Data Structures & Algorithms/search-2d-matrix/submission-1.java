class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int b = 0, u = matrix.length - 1;
        int rowLen = matrix[0].length - 1;

        while (b <= u) {
            // if (b < 0 || u > matrix[0].length) return false;

            int mid = (b+u) / 2;

            if (matrix[mid][0] > target) {
                u = mid - 1;
                continue;
            } else if (matrix[mid][0] < target) {
                if (matrix[mid][rowLen] >= target) {
                    return binarySearchInArray(matrix[mid], target);
                } else {
                    b = mid + 1;
                    continue;
                }
            } else {
                return true;
            }
        }
        
        return false;
    }

    public boolean binarySearchInArray(int[] array, int target) {
        int l = 0, r = array.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            
            if (array[mid] > target) {
                r = mid - 1;
            } else if (array[mid] < target) {
                l = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
