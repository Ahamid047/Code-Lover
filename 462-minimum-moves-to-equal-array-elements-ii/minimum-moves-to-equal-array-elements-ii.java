class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int real = n/2;
        int num = nums[real];
        int ans =0;

        for(int i =0; i<n; i++){
            ans += Math.abs(num - nums[i]);
        }
        return ans;
    }
}