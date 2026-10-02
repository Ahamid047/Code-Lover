class Solution {
    public String reverseVowels(String s) {
        int n = s.length()-1;
        int i =0;
        char[] arr = s.toCharArray();
        while(i < n){
           
            if(!isVowel(arr[i])){
                i++;
            }else 
            if (!isVowel(arr[n])){
                n--;
            }else{
                char temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                i++;
                n--;
            }
        }
        return new String(arr);

    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}