class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int ans = -1;
        for(int i =0; i<n; i++){
            String[] arr = sentences[i].split(" ");
            ans = Math.max(ans, arr.length);
        }
        return ans;
    }
}