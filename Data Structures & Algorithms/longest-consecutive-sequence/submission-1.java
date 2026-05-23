class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            int count = 1;
            while(set.contains(curr+1)){
                curr = curr+1;
                count++;
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}
