//T.C : O(2n* (2^(2n)) -> Removing constant -> O(n * (2^n))
//S.C : O(2*n) -> Removing constant -> O(n) -> recursion stack space - Max depth of recusion tree

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
        curr += '(';
        solve(n, curr, length+1);
        curr = curr.substring(0, curr.length() - 1);

        curr += ')';
        solve(n, curr, length+1);
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