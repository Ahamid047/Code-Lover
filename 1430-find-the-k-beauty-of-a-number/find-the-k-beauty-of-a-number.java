class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int n = str.length();
        int sum =0;

        for(int i =0; i <= n-k; i++){
            for(int j =i+k; j <= i+k; j++){
                String s = str.substring(i,j);
                int temp = Integer.parseInt(s);

                if(temp != 0 && num % temp == 0){
                    sum++;
                }
            }
        }
        return sum;
    }
}