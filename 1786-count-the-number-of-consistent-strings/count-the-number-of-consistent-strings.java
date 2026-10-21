class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int ans = n;

        HashSet <Character> set =  new HashSet<>(); 
        char[] arr = allowed.toCharArray();
        for(char c : arr){
            set.add(c);
        }

        for(int i =0; i<n; i++){
            String str = words[i];
            for(int j =0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(!set.contains(ch)){
                    ans--;
                    break;
                }
            }
        }return ans;
    }
}