class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (count > 0) {
                    st.push(ch);
                }
                count++;

            } else {

                count--;
                if (count > 0) {
                    st.push(ch);
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            char temp = st.peek();
            sb.append(temp);
            st.pop();
        }
        return sb.reverse().toString();
    }
}