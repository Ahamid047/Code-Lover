
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long ans = 0;
        long m = (long) k1 + k2;

        int[] diff = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        long total = 0;
        for (int d : diff) {
            total += d;
        }

        if (total <= m) {
            return 0;
        }

        int low = 0, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long operations = 0;

            for (int d : diff) {
                if (d > mid) {
                    operations += d - mid;
                }
            }

            if (operations <= m) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        long remaining = m;

        for (int i = 0; i < n; i++) {
            if (diff[i] > low) {
                remaining -= diff[i] - low;
                diff[i] = low;
            }
        }

        // Distribute any remaining operations to reduce
        // differences that are still equal to low.
        for (int i = 0; i < n && remaining > 0; i++) {
            if (diff[i] == low && low > 0) {
                diff[i]--;
                remaining--;
            }
        }

        for (int d : diff) {
            ans += (long) d * d;
        }

        return ans;
    }
}
