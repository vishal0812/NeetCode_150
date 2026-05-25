class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int i = 0;
        int j = 0;
        int requiredCount = t.length();
        int start = -1;
        int end = -1;
        int lenDiff = Integer.MAX_VALUE;
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)-1);
            if(map.get(ch) >= 0){
                requiredCount--;
            }

            while(requiredCount == 0){

                char leftChar = s.charAt(i);

                map.put(leftChar, map.get(leftChar) + 1);

                if(map.get(leftChar) > 0){
                    requiredCount++;
                }
                
                if(lenDiff > j-i+1){
                    lenDiff = j-i+1;
                    start = i;
                    end = j;
                }
                i++;
            }
            j++;
        }
        if(start == -1 || end== -1){
            return "";
        }
        return s.substring(start,end+1);
    }
}
