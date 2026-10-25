class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans =0;
        int n = nums.length;
        int left =0;

        for(int i =0; i<n; i++){
            if(nums[i] < minK || nums[i] > maxK){
                left = i+1;
            }else{
                ans += i - left + 1;
            }
        }
        return ans;
    }
}