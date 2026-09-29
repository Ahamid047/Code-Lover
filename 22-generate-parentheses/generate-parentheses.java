// Approach-2 (Smart Recursion)
//T.C : O(2^n)
//S.C : O(2*n) -> Removing constant -> O(n) -> recursion stack space - Max depth of recusion tree

class Solution {
    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        solve(n, "", 0, 0);
        return list;
    }

    private void solve(int n, String curr, int open, int close) {
        if (curr.length() == 2 * n) {
            list.add(curr);
            return;
        }
        if (open < n) {
            curr += '(';
            solve(n, curr, open + 1, close);
            curr = curr.substring(0, curr.length() - 1);
        }

        if (close < open) {
            curr += ')';
            solve(n, curr, open, close + 1);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
}