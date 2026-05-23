class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int ans = 1;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                count++;
                ans = Math.max(ans, count);
            }
            else{
                count = 1;
            }
        }
        return ans;
    }
}
