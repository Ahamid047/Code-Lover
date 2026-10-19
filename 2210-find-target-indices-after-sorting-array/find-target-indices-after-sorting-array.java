class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int count = 0;
        int smaller = 0;
        for(int num : nums){
            if(num < target){
                smaller ++;
            }else if(num == target){
                count ++;
            }
        }
        while(count > 0){
            ans.add(smaller);
            count --;
            smaller ++;
        }
        return ans;
    }
}