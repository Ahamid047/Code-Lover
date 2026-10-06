class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int count = 0;
        int open = 0;

        for(int i =0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open ++;
            }else{
                if(open == 0){
                    count++;
                }else{
                    open--;
                }
            }
        }
        return open + count;
    }
}