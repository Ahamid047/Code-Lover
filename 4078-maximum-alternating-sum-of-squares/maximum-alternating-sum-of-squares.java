class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        int n = nums.length;
        long[] arr = new long[n];
        int m = n / 2;
        long left = 0;
        long right = 0;
        for(int i =0; i<n; i++){
            arr[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i < m) {
                left += arr[i];
            } else {
                right += arr[i];
            }

        }
        return right - left;
    }
}