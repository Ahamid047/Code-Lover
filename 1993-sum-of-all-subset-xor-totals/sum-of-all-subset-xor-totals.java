class Solution {
    public int subsetXORSum(int[] nums) {
         int n = nums.length;
        int sum = 0;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Start with empty subset
        ans.add(new ArrayList<>());

        for(int num : nums) {

            int size = ans.size();

            for(int i = 0; i < size; i++) {

                ArrayList<Integer> newList =
                    new ArrayList<>(ans.get(i));

                newList.add(num);

                ans.add(newList);
            }
        }

        for(ArrayList<Integer> list : ans){
            int xor =0;

            for(int num: list){
                xor ^= num;
            }

            sum += xor;
        }
        return sum;
    }
}