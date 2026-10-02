class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int i = 0;
        int n = arr.length - 1;
        while (i < n) {
            String temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
            i++;
            n--;
        }
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);
            if (k < arr.length - 1) {

                sb.append(" ");
            }
        }
        return new String(sb);

    }
}