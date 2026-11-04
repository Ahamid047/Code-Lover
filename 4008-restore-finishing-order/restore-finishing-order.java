class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        HashSet<Integer>map = new HashSet<>();
        for(int num : friends){
            map.add(num);
        }
        int k =0;
        for(int i =0; i<order.length; i++){
            if(map.contains(order[i])){
                ans[k++] = order[i];
            }
        }
        return ans;
    }
}