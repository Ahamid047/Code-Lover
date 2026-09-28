class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        int i = 0;
        int ans = 0;
        while(i < n){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                ans = Math.max(ans, st.size());

            }else if(ch == ')'){
                st.pop();
            }
            i++;
        }
        return ans;
    }
}