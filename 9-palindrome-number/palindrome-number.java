class Solution {
    public boolean isPalindrome(int x) {
        int orig = x;
        if(x < 0)return false;
        int res = 0;
        while(x > 0){
            int temp = x % 10;
            res = res*10 + temp;
            x /= 10;
        }
        return orig == res;
    }
}