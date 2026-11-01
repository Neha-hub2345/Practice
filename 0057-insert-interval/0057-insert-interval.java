class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        //adding the smaller elements in array list 
        while(i < n && intervals[i][1] < newInterval[0]){
            merged.add(intervals[i]);
            i++;
        }

        //finding the overlapping intervals with new interval
        while(i <n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        merged.add(newInterval);

        //add remaining intervals
        while(i < n){
            merged.add(intervals[i]);
            i++;
        }
        return merged.toArray(new int[merged.size()][]);
    }
}