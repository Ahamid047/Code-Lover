class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list = new ArrayList<>();

        if(matrix == null || matrix.length == 0)return list;
        int m = matrix.length;
        int n = matrix[0].length;

        int left =0;
        int right = n-1;
        int top = 0;
        int bottom = m -1;

        while(top <= bottom && left <= right){
            // Traversing from left to right
            for(int j = left; j<= right; j++){
                list.add(matrix[top][j]);
            }
            top++;

            //Traversing from top to bottom
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left
            if(top <= bottom){
                for(int j = right ; j >= left; j--){
                    list.add(matrix[bottom][j]);
                }
                bottom --;
            }

            //Traverse from bottom to top
            if(left <= right){
                for(int i = bottom; i>= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}