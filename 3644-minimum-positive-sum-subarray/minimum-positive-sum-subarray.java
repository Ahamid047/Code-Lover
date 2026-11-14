class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int[] prefix = new int[n];
        int ans = -1;
        prefix[0] = nums.get(0);
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums.get(i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;
                if (j - i + 1 >= l && j - i + 1 <= r) {
                    int sum;
                    if (i == 0) {
                        sum = prefix[j];
                    } else {
                        sum = prefix[j] - prefix[i - 1];
                    }

                    if (sum > 0) {
                        if (sum < ans || ans == -1) {
                            ans = sum;

                        }
                    }
                }
            }
        }
        return ans;
    }
}