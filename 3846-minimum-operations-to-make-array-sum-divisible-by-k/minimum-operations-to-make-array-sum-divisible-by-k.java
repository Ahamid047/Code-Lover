class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % k == 0){
            return 0;
        }else{
            while((sum > 0) && !(sum % k == 0)){
                sum --;
                ans ++;
            }
        }
        return ans;
    }
}