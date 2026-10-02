class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int n = nums.length;
        arr[0] = nums[0];

        for (int i = 1; i < n; i++) {
            arr[i] = nums[i] + arr[i - 1];
        }

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < n; i++) {
            int target = arr[i] - k;
            if (map.containsKey(target)) {
                count += map.get(target);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;

    }
}