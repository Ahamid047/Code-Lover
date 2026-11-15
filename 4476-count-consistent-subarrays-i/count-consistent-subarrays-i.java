class Solution {
    public int countConsistent(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int con = nums[i];
                int min = nums[i];
                for (int k = i+1; k <= j; k++) {
                    if (nums[k] < min) {
                        min = nums[k];
                    }
                    con = con & nums[k];
                }
                if (con == min)
                    ans++;
            }
        }
        return ans;
    }
}