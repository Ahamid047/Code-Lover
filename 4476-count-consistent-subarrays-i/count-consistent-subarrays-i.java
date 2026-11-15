class Solution {
    public int countConsistent(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int con = nums[i];
            int min = nums[i];
            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
                con = con & nums[j];
                if (con == min)
                    ans++;
            }

        }
        return ans;
    }
}