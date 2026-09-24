class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int ans = 0;
            int temp = nums[i];
            while (temp > 0) {
                int rem = temp % 10;
                ans += rem;
                temp /= 10;
            }

            if (ans == i) {
                return i;
            }
        }
        return -1;
    }
}