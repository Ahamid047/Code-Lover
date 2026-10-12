class Solution {
    public int maxOperations(String s) {
        int n = s.length();
        int count =0;
        int ones =0;
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                ones++;
            }else if(i > 0 && s.charAt(i-1) == '1'){
                count += ones;
            }
        }
        return count;
    }
}