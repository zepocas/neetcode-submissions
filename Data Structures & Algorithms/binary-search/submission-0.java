class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int left = 0, right = nums.length-1;
        
        while (left <= right) { 
            int mid = left + ((right - left) / 2);

            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}



// [-1,0,2,4,6,8]  0