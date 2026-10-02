class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int len1 = word1.length;
        int len2 = word2.length;

        int m =0;
        int n =0;
        int i = 0;
        int j =0;

        while(m < len1 && n < len2){
            if(word1[m].charAt(i) != word2[n].charAt(j))return false;

            i++;
            j++;

            if(i == word1[m].length()){
                m++;
                i = 0;
            }

            if(j == word2[n].length()){
                n++;
                j = 0;
            }
        }
        return m == len1 && n == len2;
    }
}