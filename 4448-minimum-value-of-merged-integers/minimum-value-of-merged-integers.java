class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n/2];
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i += 2){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            sb.append(nums[i+1]);
            int temp = Integer.parseInt(sb.toString());
            ans = Math.min(temp, ans);
        }
        return ans;
    }
}