class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int count = 0;
        int extra = 0;
        int close = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count += 2;
            } else {
                if(count > 0){
                    count --;
                }else{
                    extra ++;
                    count = 1;
                }

                if(i + 1 < n && s.charAt(i+1) == ')'){
                    i++;
                }else{
                    extra++;
                }
                count--;
            }
        }
        return count + extra;
    }
}