class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int b = 0, u = matrix.length - 1;
        int COLS = matrix[0].length - 1;
        int mid;

        while (b <= u) {
            mid = (b+u) / 2;

            if (target > matrix[mid][COLS]) {
                b = mid + 1;
            } else if (target < matrix[mid][0]) {
                u = mid -1;
            } else {
                break;
            }
        }

        if (!(b <= u)) {
            return false;
        }

        mid = (b+u) / 2;
        return binarySearchInArray(matrix[mid], target);
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
