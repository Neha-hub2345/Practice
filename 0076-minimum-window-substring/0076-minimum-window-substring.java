class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        
        int[] need = new int[256];
        int[] have = new int[256];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int low = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        
        for (int high = 0; high < s.length(); high++) {
            have[s.charAt(high)]++;

            while (fun(have, need)) {
                int currentLen = high - low + 1;

                if (currentLen < minLen) {
                    minLen = currentLen;
                    start = low;
                }
                
                have[s.charAt(low)]--;
                low++;
            }
        }
        
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        
        return s.substring(start, start + minLen);
    }

    private boolean fun(int[] have, int[] need) {
        for (int i = 0; i < 256; i++) {
            if (have[i] < need[i]) {
                return false;
            }
        }
        return true;
    }
}