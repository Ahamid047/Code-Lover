class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(0);

        int count =0;
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(0);
            }else{
                int inside = st.pop();
                if(inside == 0){
                    inside = 1;
                }else{
                    inside = 2 * inside;
                }
                st.push(st.pop() + inside);
            }
        }
        return st.peek();
    }
}