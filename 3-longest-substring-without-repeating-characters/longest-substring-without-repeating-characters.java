class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int max = 0;
        int start = 0;
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, i);
            max = Math.max(max, i - start +1);
        }
        return max;
    }
}

// if(map.containsKey(current)){
//                 start=Math.max(start,map.get(current)+1);
//             }
//             map.put(current,end);

//             maxLength = Math.max(maxLength,end-start+1);
//         }
//         return maxLength;