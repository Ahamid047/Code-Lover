class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int ans =0;
        char[] arr = s.toCharArray();
        for(int i =0; i<n-1; i+=2){
            if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                continue;
            }

            if(s.charAt(i) == '0' && s.charAt(i+1) == '0'){
                continue;
            }

            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                ans++;
            }

            if(s.charAt(i) == '1' && s.charAt(i+1) == '0'){
                ans++;
            }
        }
        return ans;
    }
}