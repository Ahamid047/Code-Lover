class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0]));
        int count = 0;
        for(int i = 0; i < n; i++){
            int end = intervals[i][1];
            for(int j = i + 1; j < n; j++){
                int start = intervals[j][0];
                if(start <= end) count++;
            }
        }
        
        return count;
    }
}