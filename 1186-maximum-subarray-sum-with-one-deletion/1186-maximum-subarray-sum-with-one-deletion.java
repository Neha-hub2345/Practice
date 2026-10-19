class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = 0;
        int res = arr[0];

        for(int i = 1; i < arr.length; i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;

            nodelete = Math.max(nodelete + arr[i], arr[i]);

            onedelete = Math.max(onedelete + arr[i], prevnodelete);

            res = Math.max(res, Math.max(onedelete, nodelete));
        }
        return res;
    }
}