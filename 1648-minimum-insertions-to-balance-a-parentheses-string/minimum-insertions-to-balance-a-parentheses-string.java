class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int count = 0;
        int open = 0;
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '(') count += 2;
            else{
                if(i + 1 < n && s.charAt(i + 1) == ')'){
                    i++;
                }else{
                    open++;
                }
                if(count >= 2) count -= 2;
                else open++;
            }
        }
        
        return open + count;
    }
}
