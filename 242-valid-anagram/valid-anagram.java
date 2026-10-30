class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(arr1.length != arr2.length)return false;

        for(int i =0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
        
        
        // HashMap<Character,Integer> map = new HashSet<>();

        // if(s.length() != t.length())return false;
        // for(int i =0; i<s.length(); i++){
        //     map.put(s.charAt(i),map.getOrDefault(0,s.charAt(i))+1);
        // }

        // for(int i =0; i<t.length(); i++){
        //     map.put(t.charAt(i),map.getOrDefault(0,t.charAt(i))+1);
        // }

        // return true;
    }
}