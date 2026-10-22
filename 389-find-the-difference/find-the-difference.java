class Solution {
    public char findTheDifference(String s, String t) {
        int sum =0;
        int sum2 =0;
        int n = s.length();
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            sum += ch-'a';
        }

        for(int i =0; i<t.length(); i++){
           char ch = t.charAt(i);
            sum2 += ch-'a';
        }

        return (char)(sum2-sum + 'a');
    }
}