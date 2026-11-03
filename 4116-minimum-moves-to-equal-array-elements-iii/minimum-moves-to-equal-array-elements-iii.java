class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }

        int n = nums.length;
        int sum =0;
        for(int i =0; i<n; i++){
            sum += max - nums[i];
        }
        
        return sum;
    }
}