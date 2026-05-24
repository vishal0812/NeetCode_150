class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            int len = j-i+1;
            ans = Math.max(ans, len);
            set.add(ch);
            j++;
        }
        return ans;
    }
}
