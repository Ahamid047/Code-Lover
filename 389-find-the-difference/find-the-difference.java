class Solution {
    public char findTheDifference(String s, String t) {
        int sum =0;
        int sum2 =0;
        int n = s.length();
        for(int i =0; i<n; i++){
            sum += s.charAt(i);
        }

        for(int i =0; i<t.length(); i++){
            sum2 += t.charAt(i);
        }

        return (char)(sum2-sum);
    }
}