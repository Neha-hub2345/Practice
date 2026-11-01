class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0 ||intervals.length == 1){
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int prev = intervals[0][1];
        int toremove = 0;
        for(int i = 1; i < intervals.length; i++){
            int currentstart = intervals[i][0];
            int currentend = intervals[i][1];
            if(currentstart < prev){
                toremove++;
            }
            else{
                prev = currentend;
            }
        }
        return toremove;
    }
}