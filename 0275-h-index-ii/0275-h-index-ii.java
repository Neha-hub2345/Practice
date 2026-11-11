class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int paperCount = n - mid;

            if(citations[mid] == paperCount){
                return paperCount;
            }
            else if(citations[mid] < paperCount){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return n - low;
    }
}