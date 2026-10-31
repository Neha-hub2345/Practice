class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        //sort the intervals based on start
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int [] current = intervals[0];
        merged.add(current);
        for(int[] next : intervals){
            int end1 = current[1];
            int start2 = next[0];
            int end2 = next[1];
            //check if end1 >= start2
            if(end1 >= start2){
                current[1] = Math.max(end1, end2);
            }
            else{
                current = next;
                merged.add(current);
            }
        }
        //to convert arraylist in 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}