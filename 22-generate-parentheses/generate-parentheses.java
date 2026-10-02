class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve("", n, list);
        return list;
    }

    private void solve(String s, int n, List<String> list) {
        if (s.length() == n * 2) {
            if (isValid(s)) {
                list.add(s);
            }
            return;
        }

        solve(s + "(", n, list);
        solve(s + ")", n, list);

    }

    private boolean isValid(String str) {
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0)
                return false;
        }
        return count == 0;
    }
}