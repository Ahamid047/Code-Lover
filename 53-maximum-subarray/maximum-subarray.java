class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if (max < curr) {
                max = curr;
            }

            if (curr < 0) {
                curr = 0;
            }
        }
        return max;

        // int sum =nums[0];
        // int maxSum = nums[0];
        // int n = nums.length;
        // for(int i =1; i<n; i++){
        //     sum = Math.max(nums[i] , nums[i] + sum);
        //     maxSum = Math.max(sum, maxSum);
        // }
        // return maxSum;
    }
}