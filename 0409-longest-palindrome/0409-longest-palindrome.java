class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean odd = false;
        int len = 0;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c ,0) + 1);
        }
        for(int count : map.values()){
            len += (count/2) * 2;

            if(count % 2 != 0){
                odd = true;
            }
        }
        if(odd){
            len += 1;
        }
        return len;
    }
}