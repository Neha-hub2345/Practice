class Solution {
    public int maxProductDifference(int[] nums) {
        int bigone = 0;
        int bigtwo = 0;
        int smallone = Integer.MAX_VALUE;
        int smalltwo = Integer.MAX_VALUE;
        for(int n : nums){
            if(n < smallone){
                smalltwo = smallone;
                smallone = n;
            }
            else if(n < smalltwo){
                smalltwo = n;
            }
            if(n > bigone){
                bigtwo = bigone;
                bigone = n;
            }
            else if(n > bigtwo){
                bigtwo = n;
            }
        }
        return((bigone * bigtwo) - (smallone * smalltwo));
    }
}