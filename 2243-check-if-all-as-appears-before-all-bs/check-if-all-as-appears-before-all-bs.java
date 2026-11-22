class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int count =0;
        for(int i =0; i<n; i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        for(int i =0; i<count; i++){
            if(s.charAt(i) == 'b'){
                return false;
            }
        }
        return true;
    }
}