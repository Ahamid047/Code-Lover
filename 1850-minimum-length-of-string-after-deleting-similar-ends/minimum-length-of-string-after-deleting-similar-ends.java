class Solution {
    public int minimumLength(String s) {
        int j = s.length()-1;
        int i =0;

        int count = 0;
        while(i < j && s.charAt(i)  == s.charAt(j)){
            char ch = s.charAt(i);
            while(i <= j && ch == s.charAt(i)){
                i++;
            }
            while(j >= i && s.charAt(j) == ch){
                j--;
            }
        }
        return j-i+1;

    }
}