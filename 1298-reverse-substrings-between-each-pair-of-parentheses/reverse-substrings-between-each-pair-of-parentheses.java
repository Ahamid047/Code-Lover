import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {

        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '(') {
                st.push(i);

            } else if (sb.charAt(i) == ')') {

                int start = st.pop();

                int left = start + 1;
                int right = i - 1;

                while (left < right) {
                    char temp = sb.charAt(left);
                    sb.setCharAt(left, sb.charAt(right));
                    sb.setCharAt(right, temp);

                    left++;
                    right--;
                }
            }
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch != '(' && ch != ')') {
                res.append(ch);
            }
        }

        return res.toString();
    }
}