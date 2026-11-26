class Solution {
    public boolean canAliceWin(int n) {
        boolean flag = true;
        int stone = 10;
        while(n >= 0){
            n -= stone;
            stone--;
            flag = !flag;
        }
        return flag;
    }
}