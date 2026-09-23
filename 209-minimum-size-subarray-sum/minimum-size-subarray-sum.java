class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int currSum =0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            currSum += nums[i];
            
            while(currSum >= target){
                minLen = Math.min(minLen, i-left+1);
                currSum -= nums[left];
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}