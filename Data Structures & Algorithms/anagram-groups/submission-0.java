class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String curr : strs){
            String sortedString = sorting(curr);
            map.putIfAbsent(sortedString,new ArrayList<>());
            map.get(sortedString).add(curr);
        }
        List<List<String>>  ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> obj: map.entrySet()){
            List<String> list  = obj.getValue();
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
    public String sorting(String s){
        int freq [] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            while(freq[i] != 0){
                sb.append((char)(i+'a'));
                freq[i]--;
            }
        }
        return sb.toString();
    }
}
