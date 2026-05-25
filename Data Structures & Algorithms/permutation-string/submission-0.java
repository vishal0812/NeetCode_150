class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for(char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }
        int i = 0;
        int j = 0;
        while(j < s2.length()){
            freq[s2.charAt(j)-'a']--;
            if(j-i+1 == s1.length()){
                if(allZero(freq)){
                    return true;
                }
                freq[s2.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return false;
    }
    public boolean allZero(int freq[]){
        for(int f : freq){
            if(f != 0){
                return false;
            }
        }
        return true;
    }
}
