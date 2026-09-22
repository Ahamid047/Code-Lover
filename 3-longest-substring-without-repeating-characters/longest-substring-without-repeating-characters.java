class Solution {
    //With the hashset DS
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        int n = s.length();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));

            ans = Math.max(ans, i - left + 1);

        }
        return ans;
    }
}