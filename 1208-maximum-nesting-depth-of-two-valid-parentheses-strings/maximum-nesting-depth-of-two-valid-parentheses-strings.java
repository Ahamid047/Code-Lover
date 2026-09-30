class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] arr = new int[n];
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            char ch = seq.charAt(i);
            if (ch == '(') {
                if (a <= b) {
                    a++;
                    arr[i] = 0;
                }else{
                    b++;
                    arr[i] = 1;
                }
            }else{
                if(b <= a){
                    a--;
                    arr[i] = 0;
                }else{
                    b--;
                    arr[i] = 1;
                }
            }
        }
        return arr;
    }
}