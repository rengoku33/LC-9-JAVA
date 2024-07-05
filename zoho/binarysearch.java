class Solution {
    public int search(int[] nums, int target) {
        int end = nums.length - 1;
        int start = 0;
        return bs(nums, target, start, end);

    }

    public int bs(int[] nums, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                return mid;
            } 
            else if (nums[mid] < target) {
                return bs(nums, target, mid + 1, end);
            } 
            else {
                return bs(nums, target, start, mid - 1);
            }
        }
        return -1;
    }

    // soln without recursion
    // int start = 0, end = nums.length-1;
    // while(start<=end)
    // {
    //     int mid = (start + end) / 2;
    //     if (nums[mid] == target) {
    //         return mid;
    //     }
    //     if (nums[mid] > target) {
    //         end = mid - 1;
    //     } 
    //     else {
    //         start = mid + 1;
    //     }
    // }
    // return-1;
}
