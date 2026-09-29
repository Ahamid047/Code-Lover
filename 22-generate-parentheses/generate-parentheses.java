class Solution {
    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        
        solve(n, "", 0);
        return list;
    }

    private void solve(int n, String curr, int length){
        if(length == 2*n){
            if (isValid(curr)){
                list.add(curr);
            }
            return;
        }
        solve(n, curr + "(", length+1);

        solve(n, curr + ")", length+1);
    }

    private boolean isValid(String s){
        int count =0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }else{
                count--;
            }
            if(count < 0)return false;
        }
        return count == 0;
    }

}