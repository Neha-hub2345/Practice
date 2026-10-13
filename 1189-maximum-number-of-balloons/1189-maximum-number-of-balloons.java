class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : text.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int n = map.getOrDefault('n', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;

        int min1 = Math.min(b,a);
        int min2 = Math.min(l,o);
        int min3 = Math.min(min1,min2);

        return Math.min(min3,n);
    }
}