class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = n-1;
        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else {
                return solve(arr, i+1, j) || solve(arr, i, j-1);
            }
        }
        return true;
    }
    private boolean solve(char[] arr, int i, int j){
        while(i < j){
            if(arr[i] != arr[j]){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
