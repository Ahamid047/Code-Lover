class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int min = nums[0];
        int n = nums.length;
        
        for(int i =1;i<n;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        for(int num : nums){
            ans += num - min;
        }
        return ans;
    }
}