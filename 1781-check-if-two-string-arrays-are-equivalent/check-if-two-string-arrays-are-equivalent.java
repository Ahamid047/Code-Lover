class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int n = word1.length;
        int m = word2.length;
        for(int i =0;i<n;i++){
            String s = word1[i];
            sb1.append(s);
        }

        for(int i =0;i<m;i++){
            String s = word2[i];
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }
}