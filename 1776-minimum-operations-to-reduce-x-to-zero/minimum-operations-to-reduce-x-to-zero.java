class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        
        int find = sum - x;
        int left = 0;
        int currSum = 0;
        int maxSize = -1;
        
        for(int i = 0; i < n; i++){
            currSum += nums[i];
            
            while(left <= i && currSum > find){
                currSum -= nums[left];
                left++;
            }
            
            if(currSum == find){
                int len = i - left + 1;
                maxSize = Math.max(maxSize, len);
            }
        }
        
        if(maxSize == -1) return -1;
        return n - maxSize;
    }
}