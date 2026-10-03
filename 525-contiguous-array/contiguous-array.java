class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        map.put(0,-1);
        int count =0;
        for(int i =0; i<n; i++){
            if(nums[i] == 0){
                count -=1;
            }else{
                count += nums[i];
            }

            if(map.containsKey(count)){
                ans = Math.max(ans, i-map.get(count));
            }else{
                map.put(count, i);
            }
        }
        return ans;
    }
}