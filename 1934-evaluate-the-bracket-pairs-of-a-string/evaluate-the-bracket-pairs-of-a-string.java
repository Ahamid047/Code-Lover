class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        String ans = "";
        StringBuilder sb = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();

        for(int i =0;i<knowledge.size();i++){
            String s1 = knowledge.get(i).get(0);
            String s2 = knowledge.get(i).get(1);
            map.put(s1,s2);
        }

        int i =0;
        int n = s.length();
        while(i<n){
            char c = s.charAt(i);

            if(c == '('){
                int j = i+1;

                while(j<n && s.charAt(j) != ')'){
                    j++;
                }

                String key = s.substring(i+1, j);

                sb.append(map.getOrDefault(key,"?"));

                i = j+1;
            }else{
                sb.append(c);
                i++;
            }
        }

        return sb.toString();
    }
}