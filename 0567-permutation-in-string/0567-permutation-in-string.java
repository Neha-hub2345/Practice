class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 > n2){
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i = 0; i < n1; i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        if(matches(s1Count, s2Count)){
            return true;
        }

        for(int i = n1; i < n2; i++){
            s2Count[s2.charAt(i) - 'a']++;
            
            // Remove the old character leaving the window on the left
            s2Count[s2.charAt(i - n1) - 'a']--;
            
            // Check if frequencies match
            if (matches(s1Count, s2Count)) {
                return true;
            }
        }
        return false;
    }
    private boolean matches(int[] a,int[] b){
        for(int i = 0; i < 26; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}